# initialize a node
class Node:
    def __init__(self, value):
        self.data = value
        self.next = None

class Queue:
    def __init__(self):
        self.front = None
        self.rear = None

    def do_enqueue(self, value):
        # Create a new node
        new_node = Node(value)
        
        # If queue is empty, set 
        # new node as front and rear
        if self.front is None:
            self.front = new_node
            self.rear = new_node
        else:
            # If queue is not empty,
            # add new node at the rear
            self.rear.next = new_node
            self.rear = new_node

    def display(self):
        # Display the elements in the queue
        current = self.front
        if current is None:
            print("Queue is empty")
            return
        while current is not None:
            print(current.data, end="  < - ")
            current = current.next
        print("rear")

    def do_dequeue(self):
        # Check if queue is empty
        if self.front is None:
            print("Queue is empty, cannot dequeue")
            return None
        else:
            # dequeue the front element
            temp = self.front
            self.front = self.front.next
            if self.front is None:
                self.rear = None
            return temp.data


queue = Queue()
queue.do_enqueue(1)
queue.do_enqueue(2)
queue.do_enqueue(3)

# Display the elements in the queue
queue.display()  
dequeued_value = queue.do_dequeue()
print(f"Dequeued value: {dequeued_value}")

# Display the elements after do_dequeue
queue.display()