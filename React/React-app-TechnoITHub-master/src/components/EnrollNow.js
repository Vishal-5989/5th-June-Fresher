import React from 'react';
import { Form , FormControl , InputGroup , Button } from "react-bootstrap";
import QR_code from '../Images/QR_code.png'


export default function EnrollNow() {
  return (
    <div>
        <div className='mb-5'></div>
        <div className='container'>
            <section className="mb-4">
                <div className="row">
                    <div className="col-md-9 mb-md-0 mb-5">
                        
                            <div className="row">
                                <InputGroup className="mb-3">
                                    <InputGroup.Text>First name</InputGroup.Text>
                                    <FormControl aria-label="first_name" />
                                    <InputGroup.Text>Middle name</InputGroup.Text>
                                    <FormControl aria-label="middle_name" />
                                    <InputGroup.Text>Last name</InputGroup.Text>
                                    <FormControl aria-label="last_name" />
                                </InputGroup>

                                <InputGroup className="mb-3">
                                    <FormControl
                                    placeholder="Email id..."
                                    aria-label="Recipient's username"
                                    aria-describedby="basic-addon2"
                                    />
                                    <InputGroup.Text id="basic-addon2">@example.com</InputGroup.Text>
                                   
                                    <FormControl
                                    placeholder="Mobile number..."
                                    aria-label="Recipient's mobile number"
                                    aria-describedby="basic-addon3"
                                    />
                                    <InputGroup.Text id="basic-addon2">+91</InputGroup.Text>
                                </InputGroup>

                                <InputGroup className="mb-3">
                                    <InputGroup.Text>Year</InputGroup.Text>
                                    <FormControl aria-label="year" />
                                    <InputGroup.Text>Branch</InputGroup.Text>
                                    <FormControl aria-label="branch" />
                                    <InputGroup.Text>College name</InputGroup.Text>
                                    <FormControl aria-label="college_name" />
                                </InputGroup>

                                <InputGroup>
                                    <InputGroup className="mb-3">
                                        <InputGroup.Text>Mode of teaching</InputGroup.Text>  
                                    </InputGroup>
                                    <InputGroup className="col-md-5 mb-3">
                                        <Form.Check type="radio" aria-label="online" label={'Online'} />
                                    </InputGroup>
                                    <InputGroup className="col-md-4 mb-3">
                                        <Form.Check type="radio" aria-label="offline" label={'Offline'}/>   
                                    </InputGroup>
                                </InputGroup>

                                <InputGroup className="mb-3">
                                    <InputGroup>
                                        <InputGroup.Text>Transaction id</InputGroup.Text>
                                        <FormControl aria-label="transaction_id" />
                                    </InputGroup>
                                </InputGroup>

                                <Form.Group controlId="formFile" className="mb-3">
                                        <Form.Label>UPLOAD TRANSACTION SCREENSHOT</Form.Label>
                                        <Form.Control type="file" />
                                </Form.Group> 

                                
                            </div>      
                            <br></br>                      
                            
                            <Button variant="outline-primary" className='mb-3'>Submit</Button>{' '}

                    </div>

                    <div className="col-md-3 text-center">
                        <ul className="list-unstyled mb-0">
                            <li>
                                <label><strong>PAYMENT DETAILS</strong></label>
                                <img src={QR_code} alt="Sample Brand Logo" width="250" className="align-top d-inline-block" height="250"/>
                                <label><strong>SCAN THIS QR CODE FOR PAYMENT</strong></label>
                                
                                <label><strong>UPI ID :  9898660970@paytm</strong></label>
                                <label><strong>Google Pay/ Paytm : 9898660970</strong></label>
                            </li>
                        </ul>
                    </div>

                </div>
            </section>
        </div>
    </div>
  )
}
