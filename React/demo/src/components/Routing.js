export default class routing extends Comment{
    render() {
        return(
            <Router>
                <div>
                <Navbar bg="light" variant={"light"} expand="lg">
            <Container fluid>
                <Navbar.Brand>
                    <img src={Logo} alt="Sample Brand Logo" width="35" className="align-top d-inline-block" height="35"/>
                </Navbar.Brand>
                <Navbar.Toggle aria-controls="navbarScroll" />
                <Navbar.Collapse id="navbarScroll">
                <Nav
                    className="me-auto my-2 my-lg-0"
                    style={{ maxHeight: '100px' }}
                    navbarScroll
                >
                    
                    <Nav.Link href={"/home"}>Home</Nav.Link>
                    <Nav.Link href={"/courses"}>Courses</Nav.Link>
                    <Nav.Link href={"/contactus"}>Contact us</Nav.Link>
                    <Nav.Link href={"/activities"}>Activities</Nav.Link>
                    <Nav.Link href={"/service"}>Service</Nav.Link>           
                    <Nav.Link href={"/blogs"}>Blogs</Nav.Link>                                   
                </Nav>
                </Navbar.Collapse>
            </Container>
            </Navbar>
          </div>
          <div>
          <Switch>
            <Route path="/home">
                <HomePage />
            </Route>
            <Route path="/courses">
                <Test />
            </Route>
            <Route path="/contactus">
                <ContactUsPage />
            </Route>
            <Route path="/enrollnow">
                <EnrollNow />
            </Route>
            <Route path="/activities">
                <ActivitiesPage/>
            </Route>
            <Route path="/service">
                <ServicesPage/>
            </Route>
            <Route path="/blogs">
                <BlogsPage/>
            </Route>
            <Route path="/servicecardmodal">
                <ServiceCardModal/>
            </Route>
          </Switch>
          </div>
            </Router>
        )
    }
}