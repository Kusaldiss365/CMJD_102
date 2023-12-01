const Car = (props) =>{
    return(
      <div>
        <h2>Car Model - {props.model}</h2>
  
        {props.description &&// show only if description is there: Conditional Rendering
          <p>{props.description}</p>
        }
        
        
      </div>
    )
  }

  export default Car;