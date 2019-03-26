export default function Songs(songs) {
    console.log(songs);
    return songs
        .map(song => {
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


            <li class="song">
            <h5 class="song__title">${song.songTitle}</h5>
            <p class="song__duration">${song.duration}</p>
            <p class="song__rating">${song.rating}</p>
            </li>
            `;
        }).join('')


}