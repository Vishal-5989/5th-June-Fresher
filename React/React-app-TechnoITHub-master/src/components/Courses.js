import React from 'react'
import { Button, Card } from 'react-bootstrap';
import Row from 'react-bootstrap/Row'
import Container from 'react-bootstrap/Container'
import Col from 'react-bootstrap/Col'
import C_language from "../Images/Course/C.jfif";
import java from "../Images/Course/Java.jpg";
import Cplus from "../Images/Course/C++.png";
import webdevelopment from "../Images/Course/webdevelopment.jpg";
import htmlcss from "../Images/Course/html&css.jpg";
import javascript from "../Images/Course/javascript.png";
import php from "../Images/Course/php.png";
import htmlcssjs from "../Images/Course/html&css&js.png";
import iot from "../Images/Course/iot.jfif";
import react from "../Images/Course/react.jpg";
import { ListGroup } from 'reactstrap';
import { ListGroupItem } from 'reactstrap';
import { useHistory } from 'react-router-dom'; 

export default function Courses() {

  let history = useHistory();

  return (
    <div><br></br>
        <Container>
          <Row>
            <Col>   
                <Card style={{ width: '18rem',height: '36rem' }}>
                  <Card.Img variant="top" src={C_language} />
                  <Card.Body>
                    <Card.Title>C Language</Card.Title>
                    <Card.Text>
                    Techno It Hub presents the web devlopment course where you will learn to make a beautiful designecd website from HTML,CSS,Javascript,PHP
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                      <ListGroupItem>349/-</ListGroupItem>
                      <ListGroupItem> 
                          <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            ENROLL NOW
                          </Button>
                      </ListGroupItem>                  
                  </ListGroup>
                </Card>                                             
              </Col>
              <Col>   
                <Card style={{ width: '18rem' ,height: '36rem' }}>
                  <Card.Img variant="top" src={Cplus} style={{ width: '14rem' ,height: '13rem' ,paddingLeft: '39px'}}/>
                  <Card.Body>
                    <Card.Title>C++</Card.Title>
                    <Card.Text>
                      Techno IT Hub presents the C language Course which will be for the beginners in Programming World and lay the strong foundation of the programming
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                    <ListGroupItem>499/-</ListGroupItem>
                    <ListGroupItem> 
                        <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            ENROLL NOW
                        </Button>
                    </ListGroupItem> 
                  </ListGroup>
                </Card>                                             
              </Col>
              <Col>   
                <Card style={{ width: '18rem',height: '36rem'  }}>
                  <Card.Img variant="top" src={java} style={{ width: '15rem',height: '13rem',paddingLeft: '23px'}}/>
                  <Card.Body>
                    <Card.Title>Java</Card.Title>
                    <Card.Text>
                      Techno IT Hub presents the C language Course which will be for the beginners in Programming World and lay the strong foundation of the programming
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                    <ListGroupItem>499/-</ListGroupItem>
                    <ListGroupItem> 
                        <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            ENROLL NOW
                        </Button>
                    </ListGroupItem> 
                  </ListGroup>
                </Card>                                             
              </Col>
              
          </Row>
          <br></br>
          <Row>
            <Col>   
                <Card style={{ width: '18rem',height: '36rem'  }}>
                  <Card.Img variant="top" src={htmlcss} />
                  <Card.Body>
                    <Card.Title>HTML & CSS</Card.Title>
                    <Card.Text>
                    Techno It Hub presents the web devlopment course where you will learn to make a beautiful designecd website from HTML,CSS,Javascript,PHP
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                      <ListGroupItem>349/-</ListGroupItem>
                      <ListGroupItem> 
                          <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            ENROLL NOW
                          </Button>
                      </ListGroupItem>                  
                  </ListGroup>
                </Card>                                             
              </Col>
              <Col>   
                <Card style={{ width: '18rem',height: '36rem'  }}>
                  <Card.Img variant="top" src={javascript} />
                  <Card.Body>
                    <Card.Title>JavaScript</Card.Title>
                    <Card.Text>
                      Techno IT Hub presents the C language Course which will be for the beginners in Programming World and lay the strong foundation of the programming
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                    <ListGroupItem>349/-</ListGroupItem>
                    <ListGroupItem> 
                        <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            ENROLL NOW
                        </Button>
                    </ListGroupItem> 
                  </ListGroup>
                </Card>                                             
              </Col>
              <Col>   
                <Card style={{ width: '18rem',height: '36rem'  }}>
                  <Card.Img variant="top" src={php} style={{ width: '16rem',height: '12rem'  }}/>
                  <Card.Body>
                    <Card.Title>PHP</Card.Title>
                    <Card.Text>
                      Techno IT Hub presents the C language Course which will be for the beginners in Programming World and lay the strong foundation of the programming
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                    <ListGroupItem>899/-</ListGroupItem>
                    <ListGroupItem> 
                        <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            ENROLL NOW
                        </Button>
                    </ListGroupItem> 
                  </ListGroup>
                </Card>                                             
            </Col>
          </Row>
          <br></br>
          <Row>
            <Col>   
                <Card style={{ width: '18rem',height: '36rem'  }}>
                  <Card.Img variant="top" src={htmlcssjs} style={{ height: '12rem'  }}/>
                  <Card.Body>
                    <Card.Title>HTML,CSS & JS</Card.Title>
                    <Card.Text>
                    Techno It Hub presents the web devlopment course where you will learn to make a beautiful designecd website from HTML,CSS,Javascript,PHP
                    </Card.Text>
                  </Card.Body>
                  <ListGroup className="list-group-flush">
                      <ListGroupItem>549/-</ListGroupItem>
                      <ListGroupItem> 
                          <Button variant="primary" onClick={()=> 
                            {   
                              history.push({pathname: '/enrollnow'});
                            }}>
                            ENROLL NOW
                          </Button>
                      </ListGroupItem>                  
                  </ListGroup>
                </Card>                                             
              </Col>
              <Col>   
                <Card style={{ width: '18rem',height: '36rem'  }}>
                  <Card.Img variant="top" src={webdevelopment} />
                  <Card.Body>
                    <Card.Title>Web development</Card.Title>
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
                            ENROLL NOW
                        </Button>
                    </ListGroupItem> 
                  </ListGroup>
                </Card>                                             
              </Col>
              <Col>   
                <Card style={{ width: '18rem',height: '36rem'  }}>
                  <Card.Img variant="top" src={iot} style={{ height: '12rem'  }}/>
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
                            ENROLL NOW
                        </Button>
                    </ListGroupItem> 
                  </ListGroup>
                </Card>                                             
            </Col>
          </Row>
          <br></br>
          <Row>
            <Col>   
                <Card style={{ width: '18rem',height: '36rem'  }}>
                  <Card.Img variant="top" src={react} style={{ height: '12rem'  }}/>
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
                            ENROLL NOW
                          </Button>
                      </ListGroupItem>                  
                  </ListGroup>
                </Card>                                             
              </Col>
          </Row>
        </Container>
    </div>
  )
}
