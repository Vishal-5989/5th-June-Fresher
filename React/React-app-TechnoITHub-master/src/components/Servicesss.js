import React from 'react'
import { Button, Card } from 'react-bootstrap';
import Row from 'react-bootstrap/Row'
import Container from 'react-bootstrap/Container'
import Col from 'react-bootstrap/Col'
import webdevelopment from "../Images/Course/webdevelopment.jpg";
import { ListGroup } from 'reactstrap';
import { ListGroupItem } from 'reactstrap';
import { useHistory } from 'react-router-dom'; 
import "../styles/ServiceCard.css";
import ServiceCardModal from './ServiceCardModal';

export default function Courses(props) {

  let history = useHistory();
  console.log(props.title);

  return (
    <><br></br>
        <Container>
          <Row>
            <Col>   
                <Card style={{ width: '18rem',height: '44rem'   }}>
                  <Card.Img variant="top" src={webdevelopment} />
                  <Card.Body>
                    <Card.Title>Collaboration with different NGO</Card.Title>
                    <Card.Text>
                        NGOs contribute to curative health service delivery by providing human and financial resources, materials and equipment, sharing information, developing joint projects with government, and developing national health policy, as well as creating joint committees with government.
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                      <ListGroupItem>349/-</ListGroupItem>
                      <ListGroupItem> 
                        <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            SEND INQUIRY
                        </Button>
                      </ListGroupItem>                  
                  </ListGroup>
                </Card>                                             
              </Col>
              <Col>   
                <Card style={{ width: '18rem',height: '44rem'   }}>
                  <Card.Img variant="top" src={webdevelopment} />
                  <Card.Body>
                  <Card.Title>Project Support</Card.Title>
                    <Card.Text>
                      Project Support can be anything from advice and assistance to administrative services such as collecting and compiling data. A particularly important support feature is Configuration Management which controls the assets of the project.
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                    <ListGroupItem>499/-</ListGroupItem>
                    <ListGroupItem> 
                        <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            SEND INQUIRY
                        </Button>
                    </ListGroupItem> 
                  </ListGroup>
                </Card>                                             
              </Col>
              <Col>   
                <Card style={{ width: '18rem' ,height: '44rem'  }}>
                  <Card.Img variant="top" src={webdevelopment} />
                  <Card.Body>
                    <Card.Title>Social media handling</Card.Title>
                    <Card.Text>
                      Social media management is the process of analyzing social media audiences and developing a strategy that's tailored to them, creating and distributing content for social media profiles
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                    <ListGroupItem>499/-</ListGroupItem>
                    <ListGroupItem> 
                        <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            SEND INQUIRY
                        </Button>
                    </ListGroupItem> 
                  </ListGroup>
                </Card>                                             
            </Col>
          </Row>
          <br></br>
          <Row>
            <Col>   
                <Card style={{ width: '18rem',height: '44rem'   }}>
                  <Card.Img variant="top" src={webdevelopment} />
                  <Card.Body>
                    <Card.Title>Startup Ecosystem</Card.Title>
                    <Card.Text>
                      startup ecosystem is formed by people, startups in their various stages and various types of organizations in a location, interacting as a system to create and scale new startup companies.
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                      <ListGroupItem>349/-</ListGroupItem>
                      <ListGroupItem> 
                          <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            SEND INQUIRY
                          </Button>
                      </ListGroupItem>                  
                  </ListGroup>
                </Card>                                             
              </Col>
              <Col>   
                <Card style={{ width: '18rem' ,height: '44rem'  }}>
                  <Card.Img variant="top" src={webdevelopment} />
                  <Card.Body>
                    <Card.Title>Subject wise learning</Card.Title>
                    <Card.Text>
                      Learning outcomes are user-friendly statements that tell students what they will be able to do at the end of a period of time. They are measurable and quite often observable. ... state in clear terms what it is that your students should be able to do at the end of a course that they could not do at the beginning.
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                    <ListGroupItem>349/-</ListGroupItem>
                    <ListGroupItem> 
                        <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            SEND INQUIRY
                        </Button>
                    </ListGroupItem> 
                  </ListGroup>
                </Card>                                             
              </Col>
              <Col>   
                <Card style={{ width: '18rem',height: '44rem'   }}>
                  <Card.Img variant="top" src={webdevelopment} />
                  <Card.Body>
                    <Card.Title>Web Development</Card.Title>
                    <Card.Text>
                      Techno It Hub presents the web Devlopment Course where you will learn to make a beautiful designecd website from HTML,CSS,Javascript,PHP
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                    <ListGroupItem>899/-</ListGroupItem>
                    <ListGroupItem> 
                        <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            SEND INQUIRY
                        </Button>
                    </ListGroupItem> 
                  </ListGroup>
                </Card>                                             
            </Col>
          </Row>
          <br></br>
          <Row>
            <Col>   
                <Card style={{ width: '18rem' ,height: '44rem'  }}>
                  <Card.Img variant="top" src={webdevelopment} />
                  <Card.Body>
                    <Card.Title>Graphic Designing</Card.Title>
                    <Card.Text>
                      Graphic design is the profession and academic discipline whose activity consists in projecting visual communications intended to transmit specific messages to social groups, with specific objectives.
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                      <ListGroupItem>549/-</ListGroupItem>
                      <ListGroupItem> 
                          <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            SEND INQUIRY
                          </Button>
                      </ListGroupItem>                  
                  </ListGroup>
                </Card>                                             
              </Col>
              <Col>   
                <Card style={{ width: '18rem' ,height: '44rem'  }}>
                  <Card.Img variant="top" src={webdevelopment} />
                  <Card.Body>
                    <Card.Title>Hackathon</Card.Title>
                    <Card.Text>
                      Techno IT Hub presents the C language Course which will be for the beginners in Programming World and lay the strong foundation of the programming
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                    <ListGroupItem>1099/-</ListGroupItem>
                    <ListGroupItem> 
                        <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            SEND INQUIRY
                        </Button>
                    </ListGroupItem> 
                  </ListGroup>
                </Card>                                             
              </Col>
              <Col>   
                <Card style={{ width: '18rem' ,height: '44rem'  }}>
                  <Card.Img variant="top" src={webdevelopment} />
                  <Card.Body>
                    <Card.Title>IOT</Card.Title>
                    <Card.Text>
                      Techno IT Hub presents the C language Course which will be for the beginners in Programming World and lay the strong foundation of the programming
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                    <ListGroupItem>1499/-</ListGroupItem>
                    <ListGroupItem> 
                        <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            SEND INQUIRY
                        </Button>
                    </ListGroupItem> 
                  </ListGroup>
                </Card>                                             
            </Col>
          </Row>
          <br></br>
          <Row>
            <Col>   
                <Card style={{ width: '18rem',height: '44rem'   }}>
                  <Card.Img variant="top" src={webdevelopment} />
                  <Card.Body>
                    <Card.Title>React</Card.Title>
                    <Card.Text>
                    Techno It Hub presents the web devlopment course where you will learn to make a beautiful designecd website from HTML,CSS,Javascript,PHP
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                      <ListGroupItem>1999/-</ListGroupItem>
                      <ListGroupItem>  
                          <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            SEND INQUIRY
                          </Button>
                      </ListGroupItem>                  
                  </ListGroup>
                </Card>                                             
              </Col>
          </Row>
        </Container>
        <ServiceCardModal title={props.title} id={props.id} />
    </>
  )
}
