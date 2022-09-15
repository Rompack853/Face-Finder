import * as React from 'react';
import Appbar from '../Appbar'
import Dropdown from '../Dropdown'

const isLoggedIn = false;

function inactiveButton (text){
    return <button type="button" class="btn btn-primary" style="display:none">{text}</button>
}

function activeButton(text){
    return <button type="button" class="btn btn-primary">{text}</button>
}

export default function Mainpage() {
    return (
        <div className="Mainpage">
            <Appbar/>
            <Dropdown/>
            {(isLoggedIn) ? inactiveButton("Start/Beitreten") : activeButton("Start/Beitreten")}
        </div>
    );
  }
