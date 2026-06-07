import { useState } from 'react'
import './App.css'
import Mensagem from './components/Mensagem'
import InfoCurso from './components/InfoCurso'
import Header from './components/Header'
import AdicionarUsuario from './pages/AdicionarUsuario'
import Footer from './components/Footer'
import Clientes from './pages/Clientes'
import { Route, Routes } from 'react-router-dom'
import Home from './pages/Home'
import SobreNos from './pages/SobreNos'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <Header />
    
    <h1>💣︎♏︎◆︎ 📂︎◻︎ ◻︎❒︎□︎🙰♏︎⧫︎□︎??</h1>
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur, architecto.</p>

    {/*<Mensagem/>*/}
    {/*<InfoCurso/>*/}

    <main>
    <Routes>
    <Route path='/' element={<Home />} />
    <Route path='/' element={<SobreNos />} />
    </Routes>
      <Clientes />
      <AdicionarUsuario />
    </main>
    <Footer />
    </>
  )
}

export default App
