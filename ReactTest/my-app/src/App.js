import logo from './logo.svg';
import './App.css';
import Greet from './Components/Greet';
import Welcome from './Components/Welcome';
import Hello from './Components/Hello';
import Message from './Components/Message';
import Counter from './Components/Counter';
import StyleSheet from './Components/Stylesheet'
import Inline from './Components/Inline';
import './appStyles.css'
import styles from './appStyles.module.css'

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
      <Message />
      <br />
      <Counter />

      <StyleSheet primary={true} />

      <Inline />


      <h1 className='error'>Error</h1>
      <h1 className={styles.success}>Success</h1>
    </div >
  );
}

export default App;
