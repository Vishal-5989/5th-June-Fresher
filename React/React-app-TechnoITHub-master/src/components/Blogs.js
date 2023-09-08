import React from 'react'   
import { Card } from 'react-bootstrap'
import { Container } from 'react-bootstrap'

export default function Blogs() {
  return (
    <>
    <h2 className="h1-responsive font-weight-bold text-center my-4">Blogs</h2>
    <Container>
        <Card border="primary" style={{ width: 'auto' }}>
            <Card.Header>Header</Card.Header>
            <Card.Body>
            <Card.Title>Primary Card Title</Card.Title>
            <Card.Text>
                Some quick example text to build on the card title and make up the bulk
                of the card's content.
            </Card.Text>
            </Card.Body>
        </Card>
        <br />

        <Card border="secondary" style={{ width: 'auto' }}>
            <Card.Header>Header</Card.Header>
            <Card.Body>
            <Card.Title>Secondary Card Title</Card.Title>
            <Card.Text>
                Some quick example text to build on the card title and make up the bulk
                of the card's content.
            </Card.Text>
            </Card.Body>
        </Card>
        <br />

        <Card border="success" style={{ width: 'auto' }}>
            <Card.Header>Header</Card.Header>
            <Card.Body>
            <Card.Title>Success Card Title</Card.Title>
            <Card.Text>
                Some quick example text to build on the card title and make up the bulk
                of the card's content.
            </Card.Text>
            </Card.Body>
        </Card>
        <br />

        <Card border="danger" style={{ width: 'auto' }}>
            <Card.Header>Header</Card.Header>
            <Card.Body>
            <Card.Title>Danger Card Title</Card.Title>
            <Card.Text>
                Some quick example text to build on the card title and make up the bulk
                of the card's content.
            </Card.Text>
            </Card.Body>
        </Card>
        <br />

        <Card border="warning" style={{ width: 'auto' }}>
            <Card.Header>Header</Card.Header>
            <Card.Body>
            <Card.Title>Warning Card Title</Card.Title>
            <Card.Text>
                Some quick example text to build on the card title and make up the bulk
                of the card's content.
            </Card.Text>
            </Card.Body>
        </Card>
        <br />

        <Card border="info" style={{ width: 'auto' }}>
            <Card.Header>Header</Card.Header>
            <Card.Body>
            <Card.Title>Info Card Title</Card.Title>
            <Card.Text>
                Some quick example text to build on the card title and make up the bulk
                of the card's content.
            </Card.Text>
            </Card.Body>
        </Card>
        <br />

        <Card border="dark" style={{ width: 'auto' }}>
            <Card.Header>Header</Card.Header>
            <Card.Body>
            <Card.Title>Dark Card Title</Card.Title>
            <Card.Text>
                Some quick example text to build on the card title and make up the bulk
                of the card's content.
            </Card.Text>
            </Card.Body>
        </Card>
        <br />

        <Card border="light" style={{ width: 'auto' }}>
            <Card.Header>Header</Card.Header>
            <Card.Body>
            <Card.Title>Light Card Title</Card.Title>
            <Card.Text>
                Some quick example text to build on the card title and make up the bulk
                of the card's content.
            </Card.Text>
            </Card.Body>
        </Card>
        <br />
    </Container>
    </>
  )
}
