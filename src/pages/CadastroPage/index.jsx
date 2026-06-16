import { useState } from 'react';
import './style.css';
import api from '../../Services/api';
import { toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

export default function CadastroPage() {
    const [nome, setNome] = useState('');
    const [email, setEmail] = useState('');
    const [senha, setSenha] = useState('');
    const [estaEnviado, setEstaEnviado] = useState(false);

    function limparCamposDoFormulario() {
        setNome('');
        setEmail('');
        setSenha('');
    }

    async function EnvioDoFormulario(event) {
        event.preventDefault();
        setEstaEnviado(true);
        const dadosDoFormulario = { nome, email, senha };

        try {
            const resposta = await api.post('/usuarios', dadosDoFormulario);
            toast.success(resposta.data.mensagem);
            limparCamposDoFormulario();
        } catch (erro) {
            const mensagemDoServidor = erro?.response?.data?.mensagem || 'Erro ao cadastrar';
            toast.error(mensagemDoServidor);
        } finally {
            setEstaEnviado(false);
        }
    }

    return (
        <div className='cadastro-page'>
            <form onSubmit={EnvioDoFormulario}>
                <div className='grupo-form'>
                    <label htmlFor="campo-nome">Nome</label>
                    <input 
                        id="campo-nome" 
                        type="text" 
                        placeholder='Ex.: Maria Silva' 
                        value={nome} 
                        onChange={(e) => setNome(e.target.value)} 
                    />
                </div>
                
                <div className='grupo-form'>
                    <label htmlFor="campo-email">Email</label>
                    <input 
                        id="campo-email" 
                        type="email" 
                        placeholder='Ex.: seila@gmail.com' 
                        value={email} 
                        onChange={(e) => setEmail(e.target.value)} 
                    />
                </div>

                <div className='grupo-form'>
                    <label htmlFor="campo-senha">Senha</label>
                    <input 
                        id="campo-senha" 
                        type="password" 
                        placeholder='Digite sua senha' 
                        value={senha} 
                        onChange={(e) => setSenha(e.target.value)} 
                    />
                </div>

                <button type="submit" disabled={estaEnviado}>
                    {estaEnviado ? 'Cadastrando...' : 'Cadastrar'}
                </button>
            </form>
        </div>
    );
}