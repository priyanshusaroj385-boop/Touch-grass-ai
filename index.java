
function generateAdventure() {
  const mood = document.getElementById("mood").value;
  const time = document.getElementById("time").value;
  const interest = document.getElementById("interest").value;
  const location = document.getElementById("location").value.trim();

  const activities = {
    nature: {
      title: "Mindful Nature Walk",
      description: "Explore a nearby park or safe walking path.",
      tasks: [
        "Observe three different plants.",
        "Notice five natural sounds.",
        "Record one new discovery."
      ]
    },
    photography: {
      title: "Nature Photography Hunt",
      description: "Discover interesting patterns, plants and sunlight.",
      tasks: [
        "Photograph an interesting leaf.",
        "Find a natural pattern.",
        "Capture a landscape or the sky."
      ]
    },
    gardening: {
      title: "Mini Gardening Adventure",
      description: "Explore plants and learn about their growth.",
      tasks: [
        "Observe two plants.",
        "Check whether the soil needs water.",
        "Record a question about plant growth."
      ]
    },
    birds: {
      title: "Birdwatching Discovery",
      description: "Observe birds without disturbing their habitat.",
      tasks: [
        "Look for birds from a distance.",
        "Notice their colours and behaviour.",
        "Record your observations."
      ]
    },
    fitness: {
      title: "Fresh-Air Walking Challenge",
      description: "Enjoy gentle movement in a safe outdoor space.",
      tasks: [
        "Choose a comfortable walking pace.",
        "Notice the surrounding scenery.",
        "Take a break and enjoy nature."
      ]
    }
  };

  const moodTips = {
    relaxed: "Keep things peaceful and unhurried.",
    adventurous: "Look for something new in a familiar place.",
    creative: "Notice colours, shapes and patterns.",
    curious: "Ask questions about your surroundings."
  };

  const activity = activities[interest];
  const result = document.getElementById("result");

  result.innerHTML = `
    <h3>🌿 ${activity.title}</h3>
    <p>${activity.description}</p>
    <p><strong>Time:</strong> ${escapeHTML(time)}</p>
    <p><strong>Your mood:</strong> ${moodTips[mood]}</p>
    <p><strong>Location:</strong> ${
      escapeHTML(location) || "Choose a nearby safe place"
    }</p>
    <h4>Your Outdoor Mission</h4>
    <ul>
      ${activity.tasks.map(task => `<li>${task}</li>`).join("")}
    </ul>
    <button onclick="saveAdventure()">Save Adventure</button>
    <p><small>Built-in suggestions; AI is not connected yet.</small></p>
  `;

  result.style.display = "block";
}

function escapeHTML(value) {
  return value.replace(/[&<>"']/g, character => ({
    "&": "&amp;",
    "<": "&lt;",
    ">": "&gt;",
    '"': "&quot;",
    "'": "&#39;"
  })[character]);
}

// Save adventures locally
function saveAdventure() {
  const title = document.querySelector("#result h3")?.textContent;

  if (!title) return;

  const adventures = JSON.parse(
    localStorage.getItem("tg-adventures") || "[]"
  );

  adventures.unshift({
    title,
    date: new Date().toLocaleDateString()
  });

  localStorage.setItem("tg-adventures", JSON.stringify(adventures));
  alert("Adventure saved successfully!");
}

// Nature Journal
function openJournal() {
  const journal = document.getElementById("journal");
  journal.style.display = "block";
  renderEntries();
  journal.scrollIntoView({ behavior: "smooth" });
}

function saveJournal() {
  const field = document.getElementById("journalText");
  const text = field.value.trim();

  if (!text) {
    alert("Please write an observation first.");
    return;
  }

  const entries = JSON.parse(
    localStorage.getItem("tg-journal") || "[]"
  );

  entries.unshift({
    text,
    date: new Date().toLocaleDateString()
  });

  localStorage.setItem("tg-journal", JSON.stringify(entries));

  field.value = "";
  renderEntries();
  alert("Journal entry saved!");
}

function renderEntries() {
  const entries = JSON.parse(
    localStorage.getItem("tg-journal") || "[]"
  );

  const container = document.getElementById("entries");
  if (!container) return;

  container.innerHTML = entries.map(entry => `
    <div class="entry">
      <small>${escapeHTML(entry.date)}</small>
      <p>${escapeHTML(entry.text)}</p>
    </div>
  `).join("");
}

// Gardening assistant
function askGarden() {
  document.getElementById("interest").value = "gardening";
  document.getElementById("adventure")
    .scrollIntoView({ behavior: "smooth" });
  generateAdventure();
}

// Nature explorer
function exploreNature() {
  document.getElementById("interest").value = "birds";
  document.getElementById("adventure")
    .scrollIntoView({ behavior: "smooth" });
  generateAdventure();
}

// Outdoor checklist
const checklistItems = [
  "Water bottle",
  "Comfortable footwear",
  "Weather-appropriate clothing",
  "Phone for emergencies",
  "Sun protection when needed",
  "Respect wildlife and leave no litter"
];

function showChecklist() {
  const section = document.getElementById("checklist");

  const saved = JSON.parse(
    localStorage.getItem("tg-checklist") || "{}"
  );

  document.getElementById("checkItems").innerHTML =
    checklistItems.map((item, index) => `
      <label style="display:flex;gap:10px;margin:15px 0">
        <input type="checkbox" data-index="${index}"
          style="width:auto"
          ${saved[index] ? "checked" : ""}>
        ${item}
      </label>
    `).join("");

  section.style.display = "block";
  section.scrollIntoView({ behavior: "smooth" });
}

function saveChecklist() {
  const saved = {};

  document.querySelectorAll("#checkItems input").forEach(input => {
    saved[input.dataset.index] = input.checked;
  });

  localStorage.setItem("tg-checklist", JSON.stringify(saved));
  alert("Checklist saved successfully!");
}

// Load saved journal entries when the page opens
document.addEventListener("DOMContentLoaded", () => {
  renderEntries();
});