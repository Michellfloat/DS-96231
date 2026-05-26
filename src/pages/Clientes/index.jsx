import './style.css'
import logo from '../../assets/anonymous.svg'

//Conteúdo principal
export default function Clientes(){
    return(
        <div className='clientes'>
            <img src={logo} alt="Logo da empresa" />
        <h1>Cadastrar CLientes</h1>
        </div>
    )

}