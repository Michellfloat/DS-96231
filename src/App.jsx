import { useState } from 'react'
import './App.css'
import Mensagem from './components/Mensagem'
import InfoCurso from './components/InfoCurso'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <h1>Meu 1° projeto??</h1>
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur, architecto.</p>

    <Mensagem/>
    <InfoCurso/>
    </>
  )
}

export default App
