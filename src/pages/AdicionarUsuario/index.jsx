import { useState } from 'react'
import './style.css'

//Conteúdo principal
export default function AdicionarUsuario(){
    let[nome,setNome] = useState('')
    let[email,setEmail] = useState('')
    let[listarUsuarios,setListarUsuarios] = useState([])
    
    let adicionarNovoUsuario = (event) => {
        event.preventDefault()
        if (nome && email) {
            setListarUsuarios([...listarUsuarios, {nome, email}])
            setNome('')
            setEmail('')
            
        }
    }
    return( 
        <h1>
            Adicionhar Usuário
        </h1>
    )
}