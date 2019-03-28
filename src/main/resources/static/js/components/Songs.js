import SongComments from './SongComment'

export default function Songs(songs) {

    return `

    <header>
    <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
    </header>
  <main class="main__wrapper">

  ${songs.map(song => {
    return `
<div class="main__content">
    <h2 class="song__title" id="${song.id}">${song.songTitle}</h2>
    <p class="song__rating">${song.rating}</p>
    

    
    </div>
    </div>
    `;
  }).join('')}


</main>

<<<<<<< HEAD
=======
<footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 
>>>>>>> 07973344a646a8cfa10b3975a77de30c35e7424e


`}
 