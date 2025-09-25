# StudentSuite
The app uses Optical Character Recognition (OCR)  technology to scan physical documents and convert them into digital format. The primary  purpose of the application is to help students keep track of their assignments, notes, and other  academic resources in a single, highly-organized location.


**Student Suite** is an Android application designed to be an essential tool for students. It uses Optical Character Recognition (OCR) to quickly digitize text from books, notes, and documents, making it easy to store, edit, and share academic content.

This project was submitted in partial fulfillment of the requirements for the Diploma in Computer Engineering at Thakur Polytechnic (2022-2023).

## ✨ Features

-   **Scan from Camera:** Instantly capture and recognize text from a live camera feed.
-   **Import from Gallery:** Select an image from your device's gallery to extract text.
-   **Edit Text:** Correct or add to the scanned text directly within the app.
-   **Copy to Clipboard:** Easily copy the digitized text with a single tap.
-   **Share Functionality:** Share the extracted text to other apps like WhatsApp, Gmail, or any note-taking app.

## 🛠️ Technology Stack

-   **Platform:** Android
-   **Language:** Kotlin
-   **Core Technology:** Firebase ML Kit for Text Recognition
-   **IDE:** Android Studio
-   **Build Tool:** Gradle

## 📸 Screenshots

![Output Image 1](images/image1.png)
Figure 1: output

## 🚀 Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

You need [Android Studio](https://developer.android.com/studio) installed on your machine to build and run the project.

### Setup

1.  **Clone the repo**
  
2.  **Open in Android Studio**
    -   Open Android Studio and select `Open an existing project`.
    -   Navigate to the cloned `StudentSuite` directory and open it.

3.  **Firebase Configuration**
    This project uses Firebase ML Kit. To connect it to your own Firebase project, you need to add your own `google-services.json` file.
    -   Go to the [Firebase Console](https://console.firebase.google.com/).
    -   Create a new project.
    -   Add a new Android app with the package name `com.example.studentsuite`.
    -   Download the generated `google-services.json` file.
    -   Place the `google-services.json` file in the `StudentSuite/app/` directory.

4.  **Build the Project**
    -   Android Studio should automatically sync the project with the Gradle files. If not, go to `File` > `Sync Project with Gradle Files`.
    -   Run the app on an Android emulator or a physical device.


This project was created by:

-   **Binish Moosa**

