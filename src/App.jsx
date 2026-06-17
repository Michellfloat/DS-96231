import { Route, Routes } from 'react-router-dom'
import './App.css'
import Footer from './components/Footer/Footer'
import Header from './components/Header/Header'
import Home from './assets/pages/Home/Home'
import CadastroPage from './assets/pages/CadastroPage/CadastroPage'
import ListaUsuariosPage from './assets/pages/ListaUsuarioPage/ListaUsuarioPage'

function App() {
  

  return (
    <>
      <Header />
      <main>
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/' element={<CadastroPage />} />
        <Route path='/' element={<ListaUsuariosPage />} />
      </Routes>
      </main>
      <Footer />
    </>
  )
}

export default App
