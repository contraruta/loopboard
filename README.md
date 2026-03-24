# 🎹 LoopBoard

**ADHS-flow & Loop-optimierte Android-Tastatur mit Quechua Support**

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Android](https://img.shields.io/badge/Android-34-green.svg)](https://developer.android.com/)
[![Quechua Support](https://img.shields.io/badge/Quechua-Support-blue.svg)](https://www.quechua.org/)

---

## 📌 Projektbeschreibung

LoopBoard ist eine **Android-Tastatur**, die speziell für Nutzer mit ADHS (Aufmerksamkeitsdefizit-/Hyperaktivitätsstörung) entwickelt wurde. Sie optimiert den Eingabefluss durch **Loop-Erkennung** und bietet **multilinguale Unterstützung**, inklusive **Quechua**. Die Tastatur ist **einfach, schnell und barrierefrei** gestaltet, um die Nutzererfahrung zu verbessern.

### 🔥 Features

- **ADHS-Optimierung:** Loop-Erkennung und Eingabefluss-Optimierung.
- **Multilingual:** Unterstützung für mehrere Sprachen (inkl. Quechua).
- **Anpassbare Layouts:** Einfaches Umschalten zwischen Tastatur-Layouts.
- **Barrierefrei:** Große Tasten und klare Anzeige für bessere Lesbarkeit.
- **Quechua-Übersetzung:** Einfache Übersetzung ins Quechua über integriertes Dictionary.
- **Leichtgewichtig:** Optimiert für Performance und minimalen Ressourcenverbrauch.

---

## 🚀 Installation & Setup

### 1️⃣ Repository klonen

```bash
https://github.com/contraruta/loopboard.git
cd loopboard
```

### 2️⃣ Android Studio öffnen

- Öffne das Projekt in **Android Studio**.
- Stelle sicher, dass du **Android SDK 34** installiert hast.

### 3️⃣ Quechua-Dictionary einrichten

- Füge deine **Quechua-Dictionary-Datei** (`quechua_dictionary.json`) in den Ordner `app/src/main/res/raw/` ein.
  Beispiel-Inhalt:
  ```json
  {
    "aymanta": "von hier",
    "qhipa": "hinten",
    "allin": "gut",
    "sulp'a": "schnell"
  }
  ```

### 4️⃣ Projekt bauen & ausführen

- Wähle dein **Gerät oder Emulator** aus.
- Klicke auf **Run** (▶️) in Android Studio.
- LoopBoard wird als **Input-Methode** installiert.

---

## 📂 Projektstruktur

```
loopboard/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/loopboard/
│   │   │   │   ├── core/
│   │   │   │   │   ├── LoopBoardInputMethodService.java  # Haupt-Service der Tastatur
│   │   │   │   │   ├── KeyboardLayoutManager.java         # Verwaltung der Tastatur-Layouts
│   │   │   │   │   └── QuechuaLanguageHandler.java         # Quechua-Übersetzung
│   │   │   │   ├── models/
│   │   │   │   │   └── KeyboardLayout.java               # Modell für Tastatur-Layouts
│   │   │   │   └── utils/
│   │   │   │       └── ADHSLoopOptimizer.java             # ADHS-Loop-Erkennung
│   │   ├── res/
│   │   │   ├── raw/quechua_dictionary.json               # Quechua-Dictionary
│   │   │   └── layout/keyboard_layout.xml                 # Layout der Tastatur
│   │   └── AndroidManifest.xml                            # Android-Manifest
│   └── build.gradle                                        # Gradle-Konfiguration
└── .gitignore
```

---

## 🛠️ Wichtige Code-Beispiele

### 🔹 Quechua-Übersetzung

```java
QuechuaLanguageHandler quechuaHandler = new QuechuaLanguageHandler(
    getResources().openRawResource(R.raw.quechua_dictionary)
);
String quechuaTranslation = quechuaHandler.translateToQuechua("gut");
// Ergebnis: "allin"
```

### 🔹 ADHS-Loop-Erkennung

```java
ADHSLoopOptimizer loopOptimizer = new ADHSLoopOptimizer();
loopOptimizer.trackKeyPress();
if (loopOptimizer.detectLoop("abc")) {
    // Loop erkannt: Nutzer hat "abc" mehrmals hintereinander eingegeben
}
```

### 🔹 Tastatur-Layout wechseln

```java
KeyboardLayoutManager layoutManager = new KeyboardLayoutManager();
KeyboardLayout quechuaLayout = new KeyboardLayout(R.layout.keyboard_quechua, "Quechua");
layoutManager.switchLayout(quechuaLayout);
```

---

## 📸 Screenshots

| **Standard-Layout** | **Quechua-Layout** | **ADHS-Optimierung** |
|---------------------|---------------------|----------------------|
| ![Standard-Layout](https://via.placeholder.com/300x150?text=Standard+Layout) | ![Quechua-Layout](https://via.placeholder.com/300x150?text=Quechua+Layout) | ![ADHS-Optimierung](https://via.placeholder.com/300x150?text=ADHS+Optimierung) |

---

## 📜 Lizenz

Dieses Projekt steht unter der **MIT-Lizenz** – siehe [LICENSE](LICENSE) für Details.

---

## 🤝 Mitwirken

Beiträge sind willkommen! Bitte folge diesen Schritten:

1. **Forke** das Repository.
2. Erstelle einen **Feature-Branch** (`git checkout -b feature/neue-funktion`).
3. Committe deine Änderungen (`git commit -m 'Feat: neue Funktion hinzugefügt'`).
4. Pushe in das Repository (`git push origin feature/neue-funktion`).
5. Erstelle einen **Pull Request**.

---

## 📬 Kontakt

Bei Fragen oder Feedback:
- **GitHub Issues:** [loopboard/issues](https://github.com/contraruta/loopboard/issues)
- **E-Mail:** [deine-email@example.com](mailto:deine-email@example.com)

---

## 🌟 Dankeschön

- [Android Developers](https://developer.android.com/) für die Dokumentation und Tools.
- [GitHub](https://github.com) für die Plattform.
- Allen Mitwirkenden und Testern!

---

**© 2026 LoopBoard Project. Alle Rechte vorbehalten.**