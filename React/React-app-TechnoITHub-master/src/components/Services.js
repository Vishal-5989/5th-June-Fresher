import React from 'react'
import '../styles/Services.css';
import ServiceCard from './ServiceCard'

import one from "../Images/Services/1.jpg"
import two from "../Images/Services/2.jpg"
import three from "../Images/Services/3.jpg"
import four from "../Images/Services/4.jpg"
import five from "../Images/Services/5.jpg"
import six from "../Images/Services/6.jpg"
import seven from "../Images/Services/7.jpg"
import eight from "../Images/Services/8.jpg"
import nine from "../Images/Services/9.jpg"
import ten from "../Images/Services/10.jpg"
import eleven from "../Images/Services/11.jpg"
import twelve from "../Images/Services/12.jpg"

export default function Services(){
    return(
       <>   
       <div className='servicebody'>
         <br/> 
            <br/>            
              <div className="row row-cols-1 row-cols-md-3 g-4 allcards">
                <ServiceCard id="service1" title="Project Support" image={two}/>
                <ServiceCard id="service2" title="Teaching Diff Languages" image={eleven} />
                <ServiceCard id="service3" title="Hackathon" image={eight} />
                <ServiceCard id="service4" title="Startup Ecosystem" image={four} />
                <ServiceCard id="service5" title="Collab with Different NGO" image={one} />
                <ServiceCard id="service6" title="Social Media Handling" image={three} />
                <ServiceCard id="service7" title="Graphic Designing" image={seven} />
                <ServiceCard id="service8" title="Industrial Visit" image={nine} />
                <ServiceCard id="service9" title="Internship Opporunity" image={ten} />
                <ServiceCard id="service10" title="Subject Wise Learning" image={five} />
                <ServiceCard id="service11" title="Web Development" image={six} />
                <ServiceCard id="service12" title="Mentoring" image={twelve} />
                
              </div>
            <br/>
          <br/>
          <br/>
        </div>
       </>
    );
}