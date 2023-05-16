// Задание 2
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - 
// возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class HomeWork2 {
        private LinkedList<HomeWork2> queue;
    
        public HomeWork2() {
            queue = new LinkedList<HomeWork2>();
        }
    
        public void enqueue(HomeWork2 element) {
            queue.addLast(element);
        }
    
        public HomeWork2 dequeue() {
            if (queue.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            HomeWork2 element = queue.getFirst();
            queue.removeFirst();
            return element;
        }
    
        public HomeWork2 first() {
            if (queue.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            HomeWork2 element = queue.getFirst();
            return element;
        }
}