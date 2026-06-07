import { Link, NavLink } from 'react-router-dom'
import './style.css'

//Ficará no início!!!
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
                <NavLink>
                    <Link to="/">☟︎□︎❍︎♏︎</Link>
                </NavLink>
                <NavLink>
                    <Link to="/sobre-nos">💧︎□︎♌︎❒︎♏︎ ☠︎⬄︎⬧︎</Link>
                </NavLink>
            </nav>
        </header>
    )
}