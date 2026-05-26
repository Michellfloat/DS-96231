import { useState } from 'react'
import './App.css'
import Mensagem from './components/Mensagem'
import InfoCurso from './components/InfoCurso'
import Header from './components/Header'
import AdicionarUsuario from './pages/AdicionarUsuario'
import Footer from './components/Footer'
import Clientes from './pages/Clientes'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <Header />
    <h1>Meu 1° projeto??</h1>
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur, architecto.</p>

    {/*<Mensagem/>*/}
    {/*<InfoCurso/>*/}

    <main>
      <Clientes />
      <AdicionarUsuario />
    </main>
    <Footer />
    </>
  )
}

export default App
