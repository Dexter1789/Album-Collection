export default function Songs(songs) {
    return `

    <header>
    <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
    <nav class="nav__menu">
        <ul>
            <p><li class="nav__menu__albums">Albums</li></p>
            <p><li class="nav__menu__artists">Artists</li></p>
            <p><li class="nav__menu__songs">Songs</li></p>
        </ul>
    </nav>
    <button class="menu__button"><i class="fa fa-bars"></i></button>
  </header>
  <main class="main__wrapper">

  ${songs.map(song => {
      return `
    <div class="main__content">
      <div class="main__text"><h2>${song.songTitle}</h2>
      <p class="song__duration">${song.duration}</p>
      <p class="song__rating">Average Rating:${song.rating}</p>
      
      `;
    }).join('')}
    
    </div>
    </div>
    
    <a href="0"><h3 class="main__subtitle">Add Song</h3></a>
</main>
<section class="add-artist">
<input type="text" class="add-song__title" placeholder="Song Title">
<input type="text" class="add-song__duration" placeholder="Song Duration">
<input type="text" class="add-song__rating" placeholder="Song Rating">
<input type="text" class="add-song__album" placeholder="Song Album">
<button class="add-song__submit">Add Song</button>
</section>
<footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 

`}