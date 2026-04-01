# ☕ Java DSA Mastery

A professional repository dedicated to the implementation and optimization of Data Structures and Algorithms using **Java 21**. This project focuses on clean code principles, documented complexity analysis, and a structured approach to technical problem-solving.

---

## 🔍 Searching Algorithms
Detailed implementations of fundamental search techniques.

| Algorithm | Method | Time Complexity | Space Complexity | Status |
| :--- | :--- | :--- | :--- | :--- |
| **Linear Search** | Iterative | $O(n)$ | $O(1)$ | ✅ Complete |
| **Binary Search** | Iterative | $O(\log n)$ | $O(1)$ | ✅ Complete |
| **Binary Search** | Recursive | $O(\log n)$ | $O(\log n)$ | ✅ Complete |

---

## ⚡ Sorting Algorithms
Implementations focusing on minimizing memory writes and optimizing swap operations.

### 1. Selection Sort
| Variant | Time Complexity | Space Complexity | Status |
| :--- | :--- | :--- | :--- |
| **Standard (Primitives)** | $O(n^2)$ | $O(1)$ | ✅ Complete |
| **Object-Based (by Age)** | $O(n^2)$ | $O(1)$ | ✅ Complete |

### 2. Bubble Sort
| Variant | Time Complexity | Space Complexity | Status |
| :--- | :--- | :--- | :--- |
| **Standard** | $O(n^2)$ | $O(1)$ | ✅ Complete |
| **Improved Pass Logic** | $O(n^2)$ | $O(1)$ | ✅ Complete |
| **Fully Optimized** | $O(n)$ Best / $O(n^2)$ Worst | $O(1)$ | ✅ Complete |

---

## 🛠️ Project Structure
The repository follows a clean, package-based architecture for easy navigation:

```text
src/main/java/dsa/
├── search/
│   ├── LinearSearch.java          # Sequential scanning logic
│   ├── BinarySearch.java          # Iterative O(log n) approach
│   └── RecursiveBinarySearch.java # Divide & Conquer using the Call Stack
└── sort/
    ├── SelectionSort.java         # Min-index based sorting
    ├── SelectionSortAssignment.java # Sorting custom User objects by age
    ├── BubbleSort.java            # Standard adjacent swap logic
    ├── BubbleSortImproved01.java  # Optimized inner loop range
    └── BubbleSortImproved02.java  # Early exit optimization using flags
