import { Route, Routes } from 'react-router-dom'
import './App.css'
import Footer from './components/Footer/Footer'
import Header from './components/Header/Header'
import CadastroPage from './assets/pages/CadastroPage/CadastroPage'
import ListaUsuariosPage from './assets/pages/ListaUsuarioPage/ListaUsuarioPage'
import HomePage from './pages/HomePage'

function App() {
  

  return (
    <>
      <Header />
      <main>
      <Routes>
        <Route path='/' element={<HomePage />} />
        <Route path='/cadastro-page' element={<CadastroPage />} />
        <Route path='/listar-usuarios' element={<ListaUsuariosPage />} />
      </Routes>
      </main>
      <Footer />
    </>
  )
}

export default App
