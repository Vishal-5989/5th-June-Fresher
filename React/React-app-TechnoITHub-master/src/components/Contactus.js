import React from 'react'
import Map from './Map'
import { Button , FormControl , InputGroup } from "react-bootstrap";

export default function Contactus() {
  return (
    <>
        <div className='container'>
            <section className="mb-4">
                <h2 className="h1-responsive font-weight-bold text-center my-4">Contact us</h2>
                <p className="text-center w-responsive mx-auto mb-5">We'd love to give life to your dreams.Feel free to contact us.</p>
                <div className="row">
                    <div className="col-md-9 mb-md-0 mb-5">
                        
                            <div className="row">
                                <InputGroup className="mb-3">
                                    <InputGroup.Text>First name</InputGroup.Text>
                                    <FormControl aria-label="First name" />
                                    <InputGroup.Text>Last name</InputGroup.Text>
                                    <FormControl aria-label="Last name" />
                                </InputGroup>

                                <InputGroup className="mb-3">
                                    <FormControl
                                    placeholder="Email id"
                                    aria-label="Recipient's username"
                                    aria-describedby="basic-addon2"
                                    />
                                    <InputGroup.Text id="basic-addon2">@example.com</InputGroup.Text>
                                </InputGroup>

                                <InputGroup className="mb-3">
                                    <InputGroup.Text>Subject</InputGroup.Text>
                                    <FormControl aria-label="subject" />
                                    <InputGroup.Text>Mobile number</InputGroup.Text>
                                    <FormControl aria-label="mobile" />
                                </InputGroup>

                                <InputGroup>
                                    <InputGroup.Text>Message</InputGroup.Text>
                                    <FormControl as="textarea" placeholder='Write something ...' rows={7} aria-label="message" />
                                </InputGroup>
                            </div>      
                            <br></br>                      
                            
                            <Button variant="outline-primary" className='mb-3'>Submit</Button>{' '}

                    </div>

                    <div className="col-md-3 text-center">
                        <ul className="list-unstyled mb-0">
                            <li>
                                <svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" fill="currentColor" className="bi bi-pin-map-fill mb-2" viewBox="0 0 16 16">
                                    <path fillRule="evenodd" d="M3.1 11.2a.5.5 0 0 1 .4-.2H6a.5.5 0 0 1 0 1H3.75L1.5 15h13l-2.25-3H10a.5.5 0 0 1 0-1h2.5a.5.5 0 0 1 .4.2l3 4a.5.5 0 0 1-.4.8H.5a.5.5 0 0 1-.4-.8l3-4z"/>
                                    <path fillRule="evenodd" d="M4 4a4 4 0 1 1 4.5 3.969V13.5a.5.5 0 0 1-1 0V7.97A4 4 0 0 1 4 3.999z"/>
                                </svg>
                                <p>GIC Block 3, L.D engineering boys hostel, Ahmedabad</p>
                            </li><br></br>

                            <li>
                                <svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" fill="currentColor" className="bi bi-telephone-fill mb-2" viewBox="0 0 16 16">
                                <path fillRule="evenodd" d="M1.885.511a1.745 1.745 0 0 1 2.61.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z"/>
                                </svg>
                                <p >+91 9898 6609 70</p>
                            </li><br></br>

                            <li>
                                <svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" fill="currentColor" className="bi bi-envelope mb-2" viewBox="0 0 16 16">
                                    <path d="M0 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V4Zm2-1a1 1 0 0 0-1 1v.217l7 4.2 7-4.2V4a1 1 0 0 0-1-1H2Zm13 2.383-4.708 2.825L15 11.105V5.383Zm-.034 6.876-5.64-3.471L8 9.583l-1.326-.795-5.64 3.47A1 1 0 0 0 2 13h12a1 1 0 0 0 .966-.741ZM1 11.105l4.708-2.897L1 5.383v5.722Z"/>
                                </svg>
                                <p>technoithub111@gmail.com</p>
                            </li>
                        </ul>
                    </div>

                </div>
            </section>
        </div>
        <div className='container'>
            <Map></Map>
            <br></br><br></br>
        </div>
    </>
  )
}