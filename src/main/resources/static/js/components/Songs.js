export default function Songs(songs) {

    return `

    <header>
    <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
    </header>
  <main class="main__wrapper">

  ${songs.map(song => {
    return `
<div class="main__content">
    <div class="song__title"><h2>${song.songTitle}</h2>
    <p class="song__rating">${song.rating}</p>
    
    
    </div>
    </div>
    `;
  }).join('')}


</main>

<footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 


`}
 