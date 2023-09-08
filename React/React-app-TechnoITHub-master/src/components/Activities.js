import React from 'react'
import { Card } from 'react-bootstrap'
import { Container } from 'react-bootstrap'
import { Row } from 'react-bootstrap'
import { Col } from 'react-bootstrap'  
import { Button } from 'react-bootstrap';
import { useHistory } from 'react-router-dom'; 

export default function Activities() {
    
    let history = useHistory();

  return (
    <>
        <Container>
            
            {/* Activities */}

            <h2 className="h1-responsive font-weight-bold text-center my-4">Activities</h2>
            {[
                'Primary',
            ].map((variant) => (
                <Card
                bg={variant.toLowerCase()}
                key={variant}
                text={variant.toLowerCase() === 'light' ? 'dark' : 'white'}
                style={{ width: 'auto' }}
                className="mb-2"
                >
                <Card.Header>Internship Training</Card.Header>
                <Card.Body>
                    <Card.Title>Internship Training</Card.Title>
                    <Card.Text>
                        <ul>
                            <li>During the internship training program, students gain hands-on experience.</li>
                            <li>The training gives students practical knowledge of their field. Here, they will finally get a chance to showcase their theoretical knowledge in the real world.</li>
                        </ul>
                        
                    </Card.Text>
                </Card.Body>
                </Card>
            ))}
            {[
                'Secondary',
            ].map((variant) => (
                <Card
                bg={variant.toLowerCase()}
                key={variant}
                text={variant.toLowerCase() === 'light' ? 'dark' : 'white'}
                style={{ width: 'auto' }}
                className="mb-2"
                >
                <Card.Header>Meeting With Others</Card.Header>
                <Card.Body>
                    <Card.Title>Meeting With Others</Card.Title>
                    <Card.Text>
                        <ul>
                            <li>Networking and meeting with others enhance a lot of qualities. It helps make a person more extroverted and also improves their communication skills. </li>
                            <li>Through meeting various people, students gain a variety of knowledge. The more people they meet, the more knowledge they will be able to acquire. </li>
                            <li>It also gives students a vast audience to create long-term professional relationships with others.</li>
                        </ul>
                    </Card.Text>
                </Card.Body>
                </Card>
            ))}
            {[
                'Success',
            ].map((variant) => (
                <Card
                bg={variant.toLowerCase()}
                key={variant}
                text={variant.toLowerCase() === 'light' ? 'dark' : 'white'}
                style={{ width: 'auto' }}
                className="mb-2"
                >
                <Card.Header>Web Development</Card.Header>
                <Card.Body>
                    <Card.Title>Web Development Courses</Card.Title>
                    <Card.Text>
                        <ul>
                            <li>Tech It Hub presents Web Development Courses from HTML, CSS, JavaScript, and PHP for creating stunning websites.</li>
                        </ul>
                    </Card.Text>
                </Card.Body>
                </Card>
            ))}

            {/* Membership */}
            <br></br><br></br>
            <h2 className="h1-responsive font-weight-bold text-center my-4">Membership</h2>
            <br></br><br></br>
            
            <Row>
                <Col className="col-md-3">
                    {[
                        'Light',
                    ].map((variant) => (
                        <Card
                        bg={variant.toLowerCase()}
                        key={variant}
                        text={variant.toLowerCase() === 'light' ? 'dark' : 'white'}
                        style={{ height: '25rem' }}
                        
                        >
                        <Card.Header>Silver</Card.Header>
                        <Card.Body>
                            <Card.Title>Silver ( 499/- )</Card.Title>
                            <Card.Text>
                                <ul>
                                    <li>1-1 Mentorship</li>
                                    <li>Hackathon guidance</li>
                                    <li>Internship opportunity</li>
                                    <li>Management</li>
                                    <li>Startup support</li>
                                    <li>Free webinar</li>
                                    <li>C language</li>
                                    <li>C++</li>
                                </ul>
                            </Card.Text>                            
                            <Button variant="primary" className="btn btn-danger" onClick={()=> 
                            {   
                                history.push({pathname: '/enrollnow'});
                            }}>
                            ENROLL NOW
                            </Button>
                            
                        </Card.Body>
                        </Card>
                    ))}
                </Col>

                <Col className="col-md-3">
                    {[
                        'Warning',
                    ].map((variant) => (
                        <Card
                        bg={variant.toLowerCase()}
                        key={variant}
                        text={variant.toLowerCase() === 'light' ? 'dark' : 'white'}
                        style={{ height: '27rem'}}
                        
                        >
                        <Card.Header>Gold</Card.Header>
                        <Card.Body>
                            <Card.Title>Gold ( 999/- )
                            </Card.Title>
                            <Card.Text>
                                <ul className="col-md-9">
                                    <li>Hackathon guidance</li>
                                    <li>Internship opportunity</li>
                                    <li>Management</li>
                                    <li>Free webinar</li>
                                    <li>C language</li>
                                    <li>C++</li>
                                    <li>HTML, CSS  & JS</li>
                                    <li>Java</li>
                                </ul>
                            </Card.Text>
                            <Button variant="primary" className="btn btn-danger" onClick={()=> 
                            {   
                                history.push({pathname: '/enrollnow'});
                            }}>
                            ENROLL NOW
                            </Button>
                        </Card.Body>
                        </Card>
                        
                    ))}
                </Col>
                    
                <Col className="col-md-3">
                    {[
                        'Secondary',
                    ].map((variant) => (
                        <Card
                        bg={variant.toLowerCase()}
                        key={variant}
                        text={variant.toLowerCase() === 'light' ? 'dark' : 'white'}
                        style={{ height: '29rem'}}
                        
                        >
                        <Card.Header>Platinum</Card.Header>
                        <Card.Body>
                            <Card.Title>Platinum ( 1499/- )</Card.Title>
                            <Card.Text>
                                <ul>
                                    <li>Hackathon guidance</li>
                                    <li>Internship opportunity</li>
                                    <li>Management</li>
                                    <li>Startup support</li>
                                    <li>Free webinar</li>
                                    <li>C language</li>
                                    <li>C++</li>
                                    <li>Web dev</li>
                                    <li>Java</li>
                                </ul>
                            </Card.Text>
                            <Button variant="primary" className="btn btn-danger" onClick={()=> 
                            {   
                                history.push({pathname: '/enrollnow'});
                            }}>
                            ENROLL NOW
                            </Button>
                        </Card.Body>
                        </Card>
                    ))}
                </Col>
                    
                <Col className="col-md-3">
                    {[
                        'Info',
                    ].map((variant) => (
                        <Card
                        bg={variant.toLowerCase()}
                        key={variant}
                        text={variant.toLowerCase() === 'light' ? 'dark' : 'white'}
                        style={{ height: '31rem'}}
                        
                        >
                        <Card.Header>Diamond</Card.Header>
                        <Card.Body>
                            <Card.Title>Diamond ( 1999/- )</Card.Title>
                            <Card.Text>
                                <ul>
                                    <li>Hackathon guidance</li>
                                    <li>Internship opportunity</li>
                                    <li>Management</li>
                                    <li>Startup support</li>
                                    <li>Free webinar</li>
                                    <li>C language</li>
                                    <li>C++</li>
                                    <li>Web dev</li>
                                    <li>Java</li>
                                    <li>IOT</li>
                                    <li>React</li>
                                </ul>
                            </Card.Text>
                            <Button variant="primary" className="btn btn-danger" onClick={()=> 
                            {   
                                history.push({pathname: '/enrollnow'});
                            }}>
                            ENROLL NOW
                            </Button>
                        </Card.Body>
                        </Card>
                    ))}
                </Col>
                    
                <Col className="col-md-12">
                    {/* Collaborations */}
                    <br></br><br></br>
                    <h2 className="h1-responsive font-weight-bold text-center my-4">Collaborations</h2>
                    <br></br><br></br>

                    <Card border="primary" style={{ width: 'auto' }}>
                        <Card.Header>Collaborations</Card.Header>
                        <Card.Body>
                        <Card.Title>Collaborations</Card.Title>
                        <Card.Text>
                            <ul>
                                <li>Collaboration is one of the most required activities for any organization.</li>
                                <li>It brings people from different sections of society together to work for a common goal.</li>
                                <li>Thus, it will help people to learn from each other. Also, it opens a new channel of opportunities for society as well as the working employees of any organization.</li>
                                <li>Collaboration constantly reminds us to work for the Vision and Mission of the organization.</li>
                            </ul>
                        </Card.Text>
                        </Card.Body>
                    </Card>
                    <br />
                </Col>
            </Row>
        </Container>
    </>
  )
}
