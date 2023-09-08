import React, { Component } from 'react'
import {Map, GoogleApiWrapper} from 'google-maps-react';
import '../styles/Map.css'

export class MapContainer extends Component {
    render() {
      return (
          <div className="col-12 ">
              <Map             
                  google={this.props.google}
                  zoom={10}
                  initialCenter = {                    
                      {  
                          lat : 23.03282845,
                          lng : 72.54671281964617,
                      }
                  }
              />
          </div>       
      );
    }
  }
   
  export default GoogleApiWrapper({
    apiKey: "AIzaSyCBq9U-U96QRiuskNWQMI2V1k1SXOZwsKo"
  })(MapContainer)
