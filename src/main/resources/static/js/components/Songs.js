import SongComments from './SongComment'

export default function Songs(songs) {

    return `
    <header>
        <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
        <a href="index.html"><button class="menu__button"><i class="fa fa-bars"></i></button></a>
    </header>

    <ul class="song__list">   
  ${songs.map(song => {
    return `
      <li>
        <div class="song__container">
            <h2 class="song__title" id="${song.id}">${song.songTitle}</h2>
            <p class="song__rating">Rating: ${song.rating}</p>
        </div>
      </li>
    `;

    }).join('')}
    </ul>
`}
 