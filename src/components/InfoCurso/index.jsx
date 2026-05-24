import { useState } from 'react'
import './style.css'

export default function InfoCurso() {
    let[nome, setNome] = useState("Lógica de Progamação")
    let[cargaHoraria, setCarga] = useState(162)
    let[dataInicio, setDataInicio] = useState('03/02/2025')
    let[dataTermino, setDataTermino] = useState('23/07/2025')

    let[piada, SetPiada] = useState("— Por que a plantinha não responde? — Porque ela é uma mudinha!")
    return(
        <div className='info-curso'>
            <h1>Eu falo o que quiser...</h1>
            <h2>Dados do curso:</h2>
            <p><strong>Nome:{ nome }</strong></p>
            <p>Carga Horária: { cargaHoraria }</p>
            <p>Data de Início do curso: { dataInicio }</p>
            <p>Data de Término do curso: { dataTermino }</p>
            <p>Piada Ruim: { piada }</p>
        </div>
    )
}