import './style.css'
import React, { useState } from 'react';


const Produtos = () => {
  const [arsenalCount, setArsenalCount] = useState(0);

  const produtosMockData = [
    {
      id: "PRD-901",
      name: "YubiKey 5C FIPS",
      category: "Cripto-Autenticação",
      price: "R$ 499,00",
      description: "Chave física de segurança U2F com suporte a criptografia assimétrica de nível militar contra ataques de hijacking."
    },
    {
      id: "PRD-902",
      name: "Roteador Anon-Net VPN",
      category: "Hardware de Rede",
      price: "R$ 1.250,00",
      description: "Roteador tático com firmware OpenWrt modificado e roteamento automatizado em camadas através da rede TOR/WireGuard."
    },
    {
      id: "PRD-903",
      name: "Maleta Faraday Premium",
      category: "Isolamento RF",
      price: "R$ 890,00",
      description: "Gaiola de faraday portátil que bloqueia instantaneamente sinais de celular, Wi-Fi, Bluetooth, RFID e rastreamento GPS."
    },
    {
      id: "PRD-904",
      name: "Rubber Ducky USB Tático",
      category: "Injeção de Payload",
      price: "R$ 350,00",
      description: "Dispositivo de emulação de teclado USB (Keystroke Injection) camuflado para auditorias físicas ultra-rápidas."
    }
  ];

  const addToArsenal = (productName) => {
    setArsenalCount(prev => prev + 1);
    console.log(`[SYS]: Dispositivo adicionado com sucesso: ${productName}`);
  };

  return (
    <div className="produtos-container">
      <div className="cyber-navbar">
        <div className="nav-title">// CYBER_ARSENAL_SUPPLY</div>
        <div className="arsenal-counter">
          ARSENAL_LOADED: <span className="counter-value">{arsenalCount} UNITS</span>
        </div>
      </div>

      <div className="produtos-grid">
        {produtosMockData.map((product) => (
          <div key={product.id} className="product-card">
            <div className="product-tag">{product.category}</div>
            
            <div className="product-main-info">
              <div className="product-id">{product.id}</div>
              <h2 className="product-name">{product.name}</h2>
              <p className="product-desc">{product.description}</p>
            </div>

            <div className="product-action-zone">
              <div className="product-price">{product.price}</div>
              <button 
                onClick={() => addToArsenal(product.name)}
                className="btn-arsenal"
              >
                [ ADICIONAR_AO_ARSENAL ]
              </button>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default Produtos;