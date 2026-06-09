import './style.css'
import React from 'react';


const Servicos = () => {
  const servicosMockData = [
    {
      id: "SVC-001",
      title: "Penetration Testing",
      codeName: "OP_PENTEST_ADV",
      description: "Simulação de ataques cibernéticos em ambiente real para identificar e explorar vulnerabilidades antes que agentes maliciosos o façam.",
      status: "READY"
    },
    {
      id: "SVC-002",
      title: "Auditoria de Segurança",
      codeName: "SEC_AUDIT_COMP",
      description: "Análise profunda e estática de código-fonte, arquitetura de rede e políticas de controle de acesso sob frameworks internacionais.",
      status: "READY"
    },
    {
      id: "SVC-003",
      title: "Resposta a Incidentes",
      codeName: "INC_RESPONSE_247",
      description: "Isolamento de ameaças ativas, erradicação de malwares, análise forense digital e mitigação de danos em tempo recorde.",
      status: "ACTIVE_MONITOR"
    },
    {
      id: "SVC-004",
      title: "Treinamento de Conscientização",
      codeName: "HUMAN_FIREWALL_EDU",
      description: "Campanhas simuladas de Phishing e Engenharia Social para capacitar a equipe contra vetores de ataque focados no fator humano.",
      status: "READY"
    }
  ];

  return (
    <div className="servicos-container">
      <div className="terminal-header">
        <h1 className="terminal-title"># ACCESS://WHITE_HAT_SERVICOS_LOG</h1>
        <p className="terminal-subtitle">Selecione o protocolo de defesa para inicializar a varredura.</p>
      </div>

      <div className="servicos-grid">
        {servicosMockData.map((service) => (
          <div key={service.id} className="servicos-card">
            <div className="card-header">
              <span className="card-id">[{service.id}]</span>
              <span className={`card-status ${service.status.toLowerCase()}`}>
                ● {service.status}
              </span>
            </div>
            
            <h2 className="card-title">{service.title}</h2>
            <div className="card-codename">_CODE: {service.codeName}</div>
            <p className="card-description">{service.description}</p>
            
            <div className="card-footer">
              <span className="blink-cursor">&gt;_ INITIALIZE_PROTOCOL</span>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default Servicos;