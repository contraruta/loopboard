// Simple React app logic
document.addEventListener('DOMContentLoaded', () => {
    const root = document.getElementById('root');
    
    root.innerHTML = `
        <div class="container">
            <h1>🎹 LoopBoard React App</h1>
            <p>This is a standalone React application integrated with the LoopBoard Android keyboard project.</p>
            <ul class="feature-list">
                <li><strong>ADHS-Optimierung:</strong> Loop-Erkennung und Eingabefluss-Optimierung.</li>
                <li><strong>Multilingual:</strong> Unterstützung für mehrere Sprachen (inkl. Quechua).</li>
                <li><strong>Anpassbare Layouts:</strong> Einfaches Umschalten zwischen Tastatur-Layouts.</li>
                <li><strong>Barrierefrei:</strong> Große Tasten und klare Anzeige für bessere Lesbarkeit.</li>
                <li><strong>Quechua-Übersetzung:</strong> Einfache Übersetzung ins Quechua.</li>
            </ul>
            <button class="button" onclick="window.location.href='https://github.com/contraruta/loopboard'">
                Visit GitHub Repository
            </button>
        </div>
    `;
});