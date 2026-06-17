import "./style.css"

export default function ListaUsuariosPage(){
    return(
        <footer className="footer">
            <p>
                &copy; {new Date().getFullYear()}
                - Todos os direitos reservados.
                <br />
                SENAI- BA
            </p>
        </footer>
    )
}