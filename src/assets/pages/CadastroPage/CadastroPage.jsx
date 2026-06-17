import { useState } from "react"
import "./style.css"
import api from "../../../Services/api";
import { toast } from "react-toastify";

export default function CadastroPage(){
    const[nome, setNome] = useState('');
    const[email, setEmail] = useState('');
    const[senha, setSenha] = useState('');
    const[estaEnviado, setEstaEnviado] = useState(false);

    function limparCamposDoFormulario(){
        setNome('');
        setEmail('');
        setSenha('');
    }

    async function enviarFormulario(event) {
        event.preventDefault();
        setEstaEnviado(true);
    

    const dadosDoFormulario = {
        nome : nome,
        email : email,
        senha : senha
    };

    try {
        const  resposta = await api.post('/', dadosDoFormulario);
        toast.success(resposta.data);
        limparCamposDoFormulario();
    }catch(erro){
        console.error('Erro ao enviar o formulário', erro);
    }finally {
        setEstaEnviado(false);
        }
    }
}