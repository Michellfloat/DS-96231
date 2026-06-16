import { useState } from 'react';
import './style.css';
import api from '../../Services/api';
import { toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css'; // Adicionado para estilização do toast

export default function CadastroPage() {
  const [nome, setNome] = useState('');
  const [email, setEmail] = useState('');
  const [senha, setSenha] = useState('');
  const [estaEnviado, setEstaEnviado] = useState(false);

  function limparCamposDoFormulario() {
    setNome('');
    setEmail('');
    setSenha(''); // Adicionado setSenha
  }

  async function EnvioDoFormulario(event) {
    event.preventDefault();
    setEstaEnviado(true);
    const dadosDoFormulario = { nome, email, senha };
    
    try {
      // Tenta cadastrar um usuário na API
      const resposta = await api.post('/usuarios', dadosDoFormulario);
      
      // se der certo
      toast.success(resposta.data.mensagem);
      limparCamposDoFormulario();
    } catch (erro) {
      // se der errado, erro?.response?.data?.mensagem corrigido (removido ponto extra)
      const mensagemDoServidor = erro?.response?.data?.mensagem || 'Erro ao cadastrar';
      toast.error(mensagemDoServidor);
    } finally {
      setEstaEnviado(false);
    }
  }

  return (
    <div className="container-cadastro">
      <h2>Criar Conta</h2>
      <form onSubmit={EnvioDoFormulario}>
        <div>
          <label>Nome</label>
          <input
            type="text"
            value={nome}
            onChange={(e) => setNome(e.target.value)}
            disabled={estaEnviado}
            required
          />
        </div>
        <div>
          <label>E-mail</label>
          <input
            type="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            disabled={estaEnviado}
            required
          />
        </div>
        <div>
          <label>Senha</label>
          <input
            type="password"
            value={senha}
            onChange={(e) => setSenha(e.target.value)}
            disabled={estaEnviado}
            required
          />
        </div>
        <button type="submit" disabled={estaEnviado}>
          {estaEnviado ? 'Salvando...' : 'Cadastrar'}
        </button>
      </form>
    </div>
  );
}