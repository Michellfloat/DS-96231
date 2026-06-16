import { NavLink } from 'react-router-dom';
import './style.css'; 

export default function Header() {
  return (
    <header className="header">
      <h1>Gerenciamento de Usuários</h1>
      <nav>
        <NavLink 
          to="/" 
          className={({ isActive }) => (isActive ? 'active' : '')}
        >
          Início
        </NavLink>
        <NavLink 
          to="/cadastro" 
          className={({ isActive }) => (isActive ? 'active' : '')}
        >
          Cadastro
        </NavLink>
        <NavLink 
          to="/listar-usuarios" 
          className={({ isActive }) => (isActive ? 'active' : '')}
        >
          Lista de usuários
        </NavLink>
      </nav>
    </header>
  );
}