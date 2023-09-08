import React from 'react'
import "../styles/ServiceCard.css";
import ServiceCardModal from "./ServiceCardModal";

export default function ServiceCard(props) {
  // const [value, setValue] = useState("");
  // const service = () => {
  //   setValue({
  //     value: document.getElementById("title5"),
  //   });
  //   console.log(value);
  // };
  console.log(props.title);
  return (
    <>
      <div className="col">
        <div className="card text-dark h-40">
          <img
            src={props.image}
            className="card-img-top"
            alt="..."
            id="image1"
          />
          <div className="card-body">
            <h4 className="card-title" id="title5">
              {props.title}
            </h4>
            <p className="card-text">
              This is a wider card with supporting text below as a natural
              lead-in to additional content. This card has even longer content
              than the first to show that equal height action.
            </p>
          </div>

          <div className="card-footer">
            {/* Button trigger modal  */}
            <button
              type="button"
              className="btn btn-danger"
              data-bs-toggle="modal"
              data-bs-target={`#${props.id}`}
              id="enquirybtn"
            >
              Send Enquiry
            </button>
          </div>
        </div>
      </div>

      <ServiceCardModal title={props.title} id={props.id} />
    </>
  );
}
