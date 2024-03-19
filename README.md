<h1 align = "center">TeachMeSkills_C27_lesson_20_HW</h1>
<h4>Task1:</h4> The program simulates the morning: reading the news, breakfast, coffee.
Creates and starts 3 threads.
Two options have been made: using the Runnable interface and using the Thread class.
<ul>
  <li>Thread objects are created in the Runner class and run with a specific priority.</li>
  <li>The MyRunnable class implements the Runnable interface. It overrides the run method. The imitationMorning method describes the actions of the morning.</li>
  <li>The MyThread class inherits from the Thread class. It overrides the run method. The imitationMorning method describes the actions of the morning.</li>
  
</ul>
<h4>Task2:</h4> The program describes the work of the service station. There can be a maximum of a certain number of cars in service per hundred.
Creates a class that will run in a separate thread and will add cars for service to the service station.
Creates a class that will run in a separate thread and will pick up fixed cars from the service station.
<ul>
  <li>In the Runner class, thread objects are created and launched.</li>
  <li>The Runnable interface is implemented in the EnteredCars class.It overrides the run method. The takingAwayCars method describes the logic for taking away cars from a service station.</li>
  <li>The Runnable interface is implemented in the ArrivingCars class. It overrides the run method. The addCar method describes the logic for adding cars to a service station.</li>
  <li>The Table class has two methods getCars, putCars for adding and subtracting cars per hundred. Use synchronized, wait, notify to coordinate threads.</li>
  <li>The Constants interface has a field that sets the maximum number of cars at the service station.</li>
</ul>
