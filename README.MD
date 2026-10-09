
# 🌿 TouchGrass AI — Your Outdoor Adventure Companion

### Discover. Explore. Reconnect.

TouchGrass AI is a nature-focused web application designed to encourage people to spend less time on screens and more time exploring the real world.

Built using HTML, CSS, and JavaScript, the project helps users discover outdoor activities, record nature observations, explore gardening ideas, and prepare for outdoor adventures.

The project is inspired by the idea that **AI should help people experience more of the real world, not just spend more time online.**

---

## 📌 Table of Contents

- [About the Project](#-about-the-project)
- [Problem Statement](#-problem-statement)
- [Our Solution](#-our-solution)
- [Features](#-features)
- [Technology Stack](#-technology-stack)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
- [How to Use](#-how-to-use)
- [Open-Source AI Vision](#-open-source-ai-vision)
- [Privacy and Offline Support](#-privacy-and-offline-support)
- [Future Enhancements](#-future-enhancements)
- [Contributing](#-contributing)
- [License](#-license)
- [Author](#-author)

---

## 🌱 About the Project

In today's digital world, people often spend a large amount of time using digital devices and may overlook opportunities to connect with nature.

TouchGrass AI aims to make outdoor exploration easier, more interesting, and more accessible.

The application provides personalized outdoor activity suggestions based on a user's mood, available time, and interests. It also includes a nature journal, gardening activity suggestions, nature exploration ideas, and an outdoor checklist.

The current version is a frontend prototype built with vanilla HTML, CSS, and JavaScript. It uses predefined JavaScript suggestions rather than a live AI model. Integrating an open-weight AI model is a planned enhancement.

### 🎯 Project Goal

To use accessible, open-source AI technology to encourage outdoor activities, environmental awareness, curiosity, and healthier digital habits.

---

## ❗ Problem Statement

People may want to explore nature but struggle to decide what activities to try, how to use their free time outdoors, or how to record what they discover.

At the same time, many AI-powered applications depend on external services, paid APIs, or internet connectivity.

**How might we use open-source AI to help people reconnect with nature while keeping the digital experience simple, accessible, and privacy-conscious?**

---

## 💡 Our Solution

TouchGrass AI provides a simple web interface for planning outdoor activities and recording nature discoveries.

Users can:

- Generate outdoor activity suggestions.
- Choose activities based on their interests.
- Explore gardening and birdwatching ideas.
- Maintain a personal nature journal.
- Prepare using an outdoor checklist.
- Save supported information locally in their browser.

The long-term vision is to integrate a compatible open-weight AI model that can generate more flexible, personalized suggestions without requiring a paid AI API.

---

## ✨ Features

### 1. ✨ AI Adventure Generator

Discover outdoor activities based on your preferences.

**Inputs include:**
- Mood: Relaxed, Adventurous, Creative, or Curious.
- Available time: 20 minutes, 1 hour, 2 hours, or half a day.
- Interests: Nature walks, photography, gardening, birdwatching, or fitness.
- Optional location.

**Example activities:**
- Mindful nature walks.
- Nature photography challenges.
- Birdwatching sessions.
- Mini gardening activities.
- Fresh-air walking challenges.

The current prototype uses predefined JavaScript suggestions.

### 2. 📔 Nature Journal

Record your outdoor observations and discoveries.

**Features:**
- Write personal nature observations.
- Save journal entries in browser storage.
- View previously saved entries.
- Automatically record the date.

### 3. 🌱 Garden Assistant

Explore gardening activities and plant-care ideas.

The current version provides gardening-related outdoor activity suggestions. A future AI integration could offer more flexible plant-care guidance and seasonal gardening recommendations.

### 4. 🐦 Nature Explorer

Encourages users to observe the natural world.

Possible activities include:
- Observing birds from a respectful distance.
- Exploring different plants and trees.
- Recording interesting natural patterns.
- Learning to notice changes in the environment.

Image-based species identification may be added in a future version.

### 5. ✅ Outdoor Checklist

Prepare for outdoor activities using a practical checklist.

Example items:
- Water bottle.
- Comfortable footwear.
- Weather-appropriate clothing.
- Phone for emergencies.
- Sun protection when needed.
- Leave no litter.

Checklist selections can be saved in browser storage.

### 6. 💾 Local Data Storage

The application uses the browser's `localStorage` to save supported journal entries, adventures, and checklist selections.

This allows saved information to persist across ordinary page reloads in the same browser.

### 7. 📱 Responsive Design

The interface is designed to work on different screen sizes, including desktop computers, tablets, and mobile devices.

### 8. 🌿 Nature-Inspired Interface

The user interface uses:
- Natural green and cream colours.
- Simple navigation.
- Activity cards.
- Responsive layouts.
- Clear buttons and forms.
- Nature-themed visuals.

---

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| HTML5 | Application structure |
| CSS3 | Styling and responsive layouts |
| JavaScript | Interactive functionality |
| LocalStorage | Saving data in the browser |
| Unsplash | Optional remote background imagery |
| WebLLM | Potential browser-based AI integration |
| Transformers.js | Potential local machine-learning integration |
| Git and GitHub | Version control and project hosting |

**Note:** WebLLM and Transformers.js are potential future integrations; they are not connected in the current prototype.

---

## 📂 Project Structure

```text
TouchGrassAI/
│
├── index.html       # Main webpage
├── style.css        # Styling and responsive design
├── script.js        # Application logic
└── README.md        # Project documentation
```

---

## 🚀 Getting Started

### Prerequisites

You need:

- A modern web browser, such as Google Chrome or Firefox.
- A code editor such as Visual Studio Code.
- Basic knowledge of HTML, CSS, and JavaScript.

No package installation is required for the current frontend prototype.

### 1. Clone the Repository

Replace `YOUR-USERNAME` with your GitHub username.

```bash
git clone https://github.com/YOUR-USERNAME/TouchGrassAI.git
```

### 2. Open the Project

```bash
cd TouchGrassAI
```

Open the folder in Visual Studio Code.

### 3. Run the Application

Open `index.html` directly in your browser, or use the Live Server extension in Visual Studio Code.

The website should now be ready to use.

---

## 🧭 How to Use

### Generate an Outdoor Adventure

1. Open TouchGrass AI.
2. Choose your mood.
3. Select the amount of time you have available.
4. Choose an interest.
5. Optionally enter your location.
6. Click **Generate Adventure**.
7. Review the suggested activity and its tasks.
8. Save an adventure if you want to revisit it.

### Record a Nature Observation

1. Open the Nature Journal.
2. Write about something you observed outdoors.
3. Click **Save Observation**.
4. View your saved observations below the editor.

### Use the Outdoor Checklist

1. Open the Outdoor Checklist.
2. Select the items you have prepared.
3. Click **Save Checklist**.
4. Reopen the checklist to retrieve your saved selections.

---

## 🤖 Open-Source AI Vision

Open innovation is an important part of TouchGrass AI.

Rather than relying exclusively on a closed, paid AI service, the project aims to support compatible open-weight models and open-source machine-learning tools.

### Planned AI Integration

The following technologies are candidates for future development.

**WebLLM**

WebLLM can run supported language models directly in compatible browsers using WebGPU.

Potential benefits:
- Browser-based inference.
- Reduced dependence on external inference APIs.
- Greater control over model selection.
- Opportunities for locally processed prompts.

Repository: https://github.com/mlc-ai/web-llm

**Transformers.js**

Transformers.js enables compatible machine-learning models to run in JavaScript environments, including supported browser workflows.

Potential applications:
- Text generation.
- Text classification.
- Image classification.
- Audio-related machine-learning tasks, depending on the model.

Repository: https://github.com/huggingface/transformers.js

### Why Open Innovation Matters

**1. Accessibility**

Open-source tools make it easier for students and developers to experiment with AI without necessarily purchasing an API subscription.

**2. Model Choice**

Developers can experiment with compatible models and select the one that best fits their application's needs.

**3. Privacy Potential**

With suitable local inference and local data storage, user prompts and journal entries can remain on the device rather than being sent to an external AI service.

**4. Customization**

Open tools make it easier to customize prompts, experiment with different model behaviours, and improve application functionality.

**5. Reduced API Dependence**

Local inference can avoid per-request inference charges, although hardware, electricity, hosting, and other costs may still apply.

### Important Implementation Note

The current application is not yet powered by a live AI model.

The existing adventure generator uses predefined JavaScript rules and suggestions. Genuine AI-powered generation, model downloads, and offline inference will require additional integration and testing.

Open-weight model licenses also vary. Each selected model must be checked for its redistribution and commercial-use conditions.

---

## 🔒 Privacy and Offline Support

TouchGrass AI currently stores supported saved information in browser `localStorage`.

This means:
- Journal entries are stored in the current browser.
- Checklist selections can persist after reloads.
- No account is required for the current prototype.
- Clearing browser storage can delete saved information.

The current version is not fully offline-ready.

The background image is loaded from Unsplash, and the website does not yet include a service worker or a bundled AI model.

### Planned Offline Improvements

- Add a Progressive Web App (PWA) service worker.
- Cache application assets for offline access.
- Allow saved activities to be opened without internet connectivity.
- Integrate a compatible locally available AI model.
- Clearly indicate which features work offline.

---

## 🔮 Future Enhancements

The following features could expand TouchGrass AI.

- [ ] Integrate an open-weight AI model using WebLLM.
- [ ] Add a conversational nature assistant.
- [ ] Generate more personalized outdoor activity plans.
- [ ] Add local seasonal gardening recommendations.
- [ ] Explore image-based bird and plant identification.
- [ ] Add a map of nearby parks and public green spaces.
- [ ] Implement Progressive Web App support.
- [ ] Add a dedicated offline mode.
- [ ] Improve accessibility and keyboard navigation.
- [ ] Add optional export and backup for journal entries.
- [ ] Add outdoor activity history and progress tracking.
- [ ] Test the application on different browsers and devices.

---

## 🌍 Why TouchGrass AI?

The project explores a simple idea:

**Technology should encourage meaningful experiences beyond technology itself.**

TouchGrass AI is intended to make outdoor discovery easier, encourage environmental curiosity, and demonstrate how open AI tools can support useful real-world activities.

Instead of making AI the destination, the project aims to make it a guide to the world outside.

---

## 🤝 Contributing

Contributions and suggestions are welcome.

To contribute:

1. Fork this repository.
2. Create a feature branch.
3. Make your changes.
4. Test your changes in a browser.
5. Commit your work.
6. Open a pull request describing your improvements.

Example:

```bash
git checkout -b feature/new-outdoor-activity
git add .
git commit -m "Add new outdoor activity"
git push origin feature/new-outdoor-activity
```

Please make sure your contributions are consistent with the project's goal of encouraging safe, accessible outdoor exploration.

---

## 📄 License

This project can be distributed under the MIT License.

Before publishing, add a `LICENSE` file containing the MIT License text and your chosen copyright attribution.

Third-party libraries, AI models, and image assets may have separate license requirements.

---

## 👨‍💻 Author

**Priyanshu Saroj**

Student Developer | Exploring Web Development and Open-Source AI

GitHub: https://github.com/YOUR-USERNAME

---

## ⭐ Support the Project

If you find TouchGrass AI interesting:

- Star the repository.
- Share ideas for new outdoor activities.
- Report bugs or suggest improvements.
- Contribute features that help people reconnect with nature.

### 🌿 TouchGrass AI
**Less screen time. More green time.**