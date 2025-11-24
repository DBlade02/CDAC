import  "./react";
import List from "./List";

function App() {
  const fruits = ["Apple", "Banana", "Mango", "Orange"];

  return (
    <div>
      <h1>Fruit List using Props</h1>
      <List items={fruits} />
    </div>
  );
}

export default App;
