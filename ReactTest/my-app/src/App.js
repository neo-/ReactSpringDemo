import logo from './logo.svg';
import './App.css';
import Greet from './Components/Greet';
import Welcome from './Components/Welcome';
import Hello from './Components/Hello';

function App() {
  return (
    <div className="App">
      <Greet name="Bruse" heroName="Batman">
        <p>This is test</p>
      </Greet>
      <Greet name="Rajeevan" heroName="Superman">
        <button>Ok</button>
      </Greet>
      <Greet name="Diana" heroName="Superwoman" />
      <Welcome />
      <Hello />
    </div>
  );
}

export default App;
