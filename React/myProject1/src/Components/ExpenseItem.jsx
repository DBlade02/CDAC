import "./ExpenseItem.css"

const ExpenseItem = () => {
    return (
       <>
           <div className="expense-item">
               <div>Oct 20th 2025</div>
               <div className="expense-item__description">
                   <h2>Paid Carpenter</h2>
                   <p className="expense-item__price">Rs 75000</p>
               </div>
           </div>
           <div className="expense-item">
               <div>Nov 28th 2025</div>
               <div className="expense-item__description">
                   <h2>Paid Painter</h2>
                   <p className="expense-item__price">Rs 30000</p>
               </div>
           </div>
           <div className="expense-item">
               <div>Nov 30th 2025</div>
               <div className="expense-item__description">
                   <h2>Paid Maid</h2>
                   <p className="expense-item__price">Rs 15000</p>
               </div>
           </div>
       </>
    )
}
export default ExpenseItem;
