import { Link, NavLink } from 'react-router-dom'
import './style.css'

export default function Header() {
    return (
        <header className='header'>
            <div>
                <Link to="/" className="header-logo">
                    <h2>
                        💧︎♓︎⬧︎⧫︎♏︎❍︎♋︎ ♎︎♏︎ ☟︎♋︎♍︎🙵♏︎♋︎❍︎♏︎■︎⧫︎□︎
                    </h2>
                </Link>
            </div>

            <nav>
                {/* Removido o <Link> de dentro do <NavLink>, passando o 'to' direto */}
                <NavLink to="/">☟︎□︎❍︎♏︎</NavLink>
                <NavLink to="/sobre-nos">💧︎□︎♌︎❒︎♏︎ ☠︎⬄︎⬧︎</NavLink>
                <NavLink to="/produtos">◻︎❒︎□︎♎︎◆︎⧫︎□︎⬧︎</NavLink>
                <NavLink to="/servicos">⬧︎♏︎❒︎❖︎♓︎♍︎□︎⬧︎</NavLink>
            </nav>
        </header>
    )
}