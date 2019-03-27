import Albums from './Albums'

export default function Artists(artists) {

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


        <ul class="artist">
        ${artists.map(artist => {
        console.log(artist.allAlbums);
        return `
            <h3 class="artist__name">${artist.firstName} ${artist.lastName}</h3>
            <img class="artist__image" src="${artist.artistImage}"/>
            <p class="artist__age">Age: ${artist.age}</p>
            <p class="artist__hometown">Hometown: ${artist.hometown}</p>
            <p class="artist__rating">Average Rating: ${artist.rating}</p>
                <ul class="albums">
               ${Albums(artist.allAlbums)}
            </ul>
            </li>
        `;


    }).join('')}
    </ul>
    <section class="add-artist">
    <input type="text" class="add-artist__first-name" placeholder="Artist's First Name">
    <input type="text" class="add-artist__last-name" placeholder="Artist's Last Name">
    <input type="text" class="add-artist__image" placeholder="Artist's Image">
    <input type="text" class="add-artist__age" placeholder="Artist's Age">
    <input type="text" class="add-artist__hometown" placeholder="Artist's Hometown">
    <input type="text" class="add-artist__rating" placeholder="Artist Rating">
    <button class="add-artist__submit">Add Artist</button>
    </section>
    <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 
    `;
}
