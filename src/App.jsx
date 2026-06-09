import { useState } from 'react'
import './App.css'
import Header from './components/Header'
import Footer from './components/Footer'
import { Route, Routes } from 'react-router-dom'
import Home from './pages/Home'
import SobreNos from './pages/SobreNos'
import Produtos from './pages/Produtos'
import Servicos from './pages/Servicos'
import Clientes from './pages/Clientes'
import AdicionarUsuario from './pages/AdicionarUsuario'

function App() {
  return (
    <>
      <Header />
      
      <main>
        <Routes>
          {/* Rotas principais corrigidas com seus respectivos caminhos */}
          <Route path='/' element={<Home />} />
          <Route path='/sobre-nos' element={<SobreNos />} />
          <Route path='/produtos' element={<Produtos />} />
          <Route path='/servicos' element={<Servicos />} />
          
          {/* Coloquei essas páginas dentro das rotas para não poluírem o layout global */}
          <Route path='/clientes' element={<Clientes />} />
          <Route path='/adicionar-usuario' element={<AdicionarUsuario />} />
        </Routes>
      </main>

      <Footer />
    </>
  )
}

export default App