const quizes = [
    {
        id: 1,
        question: "1 + 1 = ?",
        answers: [1, 2, 3, 4],
    },
    {
        id: 2,
        question: "2 + 2 = ?",
        answers: [2, 3, 4, 5],
    },
    {
        id: 3,
        question: "3 + 3 = ?",
        answers: [3, 4, 5, 6],
    },
];


const randomBtn = document.getElementById("btn");

function randomAnswers() {
    const questions = document.querySelectorAll(".quiz-answer");
    questions.forEach((question) => {
        const questionAnswers = question.querySelectorAll("input[type = 'radio']");

        const randomIndex = Math.floor(Math.random() * questionAnswers.length);
        const randomAnswer = questionAnswers[randomIndex];

        questionAnswers.forEach((answer) => {
            answer.checked = false;
        })

        randomAnswer.checked = true;
    });
}

randomBtn.addEventListener("click", randomAnswers);