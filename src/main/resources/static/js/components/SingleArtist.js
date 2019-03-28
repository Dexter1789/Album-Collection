import Albums from './Albums'

export default function SingleArtist(artist) {
    return `
    <header>
    <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
    </header>

    <ul class="artist">
        <li><img id="${artist.id}" class="artist__image" src="${artist.artistImage}"/></li>
        <li class="artist__name">${artist.artistName}</li>
        <li class="artist__age">${artist.age}</li>
        <li class="artist__hometown">${artist.hometown}</li>
        <li class="artist__rating">${artist.rating}</li>
            <ul>
            <li class="artist__albums">${Albums(artist.allAlbums)}</li>

       
    </ul>

    `;
}