import "./react";

function List({ items }) {
  return (
    <ul>
      {items.map((fruit, index) => (
        <li key={index}>{fruit}</li>
      ))}
    </ul>
  );
}

export default List;
