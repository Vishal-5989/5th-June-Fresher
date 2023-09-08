import React from 'react'
import arogya from "../Images/startup/s-1.png";
import contraweb from "../Images/startup/s-2.png";
import fitness from "../Images/startup/s-3.png";
import bell from "../Images/startup/s-4.png";
import cab from "../Images/startup/s-5.png";
import slider from "../Images/sliders.jpg"

import Vision from '../Images/Vision.jpg'
import '../styles/Home.css'
import { Row,Col,Card } from 'react-bootstrap';

export default function Home() {
  return (
    <div>
      <img src={slider} style={{ width: '100%' ,height : '600px'}}></img>
      
        {/* <Carousel variant="dark">
          <Carousel.Item interval={1000}>
            <img
              className="d-block w-100"
              src={slider}
              alt="First slide"
            />
            <Carousel.Caption>
              <h5>Welcome to Techno It Hub</h5>
              <h2>KNOW THE ART OF SUCCEEDING</h2>
              <h5>Our goal is to provide one-on-one mentoring and a strong support system for young aspiring minds</h5>
            </Carousel.Caption>
          </Carousel.Item>
          <Carousel.Item>
            <img
              className="d-block w-100"
              src={slider2}
              alt="Second slide"
            />
            <Carousel.Caption>
              <h5>Second slide label</h5>
              <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
            </Carousel.Caption>
          </Carousel.Item>
          <Carousel.Item>
            <img
              className="d-block w-100"
              src={webdevelopment}
              alt="Third slide"
            />
            <Carousel.Caption>
              <h5>Third slide label</h5>
              <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
            </Carousel.Caption>
          </Carousel.Item>
        </Carousel> */}
        <br></br><br></br>

        <div className='container'>
            <section className="mb-4" style={{fontSize:'20px'}}>
                <h2 className="h1-responsive font-weight-bold text-center my-4" id="a1">ABOUT US</h2><br></br>
                <div className="row">
                    <div className="col-md-6 mb-md-0 mb-5">
                        
                        <h5>Techno IT Hub is a startup and mentoring hub which offers guidance and encouragement</h5>
                        <ul>
                          <li>Create oppertunites</li>
                          <li>Offer technical as well as non-technical solutions</li>
                          <li>Support aspiring minds</li>
                        </ul>
                    </div>
                    <div className="col-md-6 text-center">
                        <ul className="list-unstyled mb-0">
                           <p style={{textAlign:'left'}}>With an aim to to blur line between students and industries, Techno IT Hub offers mentorship,start-up support,internships, hackathon guidance, workspace for live projects and far more benefits. it encourages coding and management skills. apart from providing quality education at affordable prices, Techno It hub enlightens future prospects.</p>
                        </ul>
                    </div>

                </div>
            </section>
            <br></br>


            <section className="mb-4" style={{fontSize:'20px'}}>
                <h2 className="h1-responsive font-weight-bold text-center my-4" id="a1">MISSION VISION</h2><br></br>
                <div className="row">
                    <div className="col-md-8 mb-md-0 mb-5">                        
                        <h5>The vision of Techno IT Hub includes the following key factors:</h5>
                        <ul>
                          <li>Bridging the gap between students and their relevant industries.</li>
                          <li>Providing quality and applicable courses at the most affordable rates.</li>
                          <li>Mentoring the young generation to help them achieve the pinnacle of success in their respective fields.</li>
                        </ul>
                    </div>
                    <div className="col-md-3 text-center">
                        <ul className="list-unstyled mb-0">
                            <li>
                                <img src={Vision} alt="Sample Brand Logo" width="380" className="align-top d-inline-block" height="280"/>
                            </li>
                        </ul>
                    </div>
                </div>
            </section>
            <br></br><br></br>
            
            <h2 className="h1-responsive font-weight-bold text-center my-4" id="a1">OUR STARTUPS</h2>
            <Row xs={3} md={3} className="g-4">
                <Col>
                  <Card style={{ height: '35rem' }}>
                    <Card.Img variant="top" src={arogya} style={{ height: '15rem' , width: '19rem' , paddingLeft: '2rem'}}/>
                    <Card.Body>
                      <Card.Title>Aarogya E Care</Card.Title>
                      <Card.Text>
                        A healthcare startup company with a vision to help healthcare providers effectively working within hospitals and connect remotely with patients.
                      </Card.Text>
                    </Card.Body>
                  </Card>                  
                </Col>      
                <Col>
                  <Card style={{ height: '35rem' }}>
                    <Card.Img variant="top" src={contraweb} style={{ paddingTop: '82px',paddingBottom: '78px'}}/>
                    <Card.Body>
                      <Card.Title>ContraWeb</Card.Title>
                      <Card.Text>
                      Contraweb is a platform specifically designed to provide ease in contacting contractors & client . One can acquire profound person & optimal solution for works related to construction, repairing, renovating, interior designing, etc. for building an adequate dwelling.
                      </Card.Text>
                    </Card.Body>
                  </Card>                  
                </Col>              
                <Col>
                  <Card style={{ height: '35rem' }}>
                    <Card.Img variant="top" src={fitness} style={{ paddingTop: '35px',paddingBottom: '45px'}}/>
                    <Card.Body>
                      <Card.Title>IsFitness</Card.Title>
                      <Card.Text>
                        Tracker of workouts and fitness-related metrics
                      </Card.Text>
                    </Card.Body>
                  </Card>                  
                </Col>              
                <Col>
                  <Card style={{ height: '35rem' }}>
                    <Card.Img variant="top" src={bell} />
                    <Card.Body>
                      <Card.Title>Bell Engineering</Card.Title>
                      <Card.Text>
                        Manufacturer of ceramic pulley lagging sheets along with a supplier of various ceramic spares, electrical spares, mechanical spares and more
                      </Card.Text>
                    </Card.Body>
                  </Card>                  
                </Col>  
                <Col>
                  <Card style={{ height: '35rem' }}>
                    <Card.Img variant="top" src={cab} />
                    <Card.Body>
                      <Card.Title>Cab-O-Way</Card.Title>
                      <Card.Text>
                        A service-based company to ensure easy and safe travelling across the nation
                      </Card.Text>
                    </Card.Body>
                  </Card>                  
                </Col>                                  
            </Row>
        </div>
     </div>
  )
}
