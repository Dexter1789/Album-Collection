import ArtistComment from './ArtistComment'
import Albums from './Albums'
export default function Artists(artists) {

    return `
    <header>
        <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
        <a href="index.html"><button class="menu__button"><i class="fa fa-bars"></i></button></a>
    </header>
    

    <div class="logo2"><img src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></div>
    <ul class="artist__list">
        ${artists.map(artist => {
            return `
            <li>
                <div class="artist__container">
                    <img id="${artist.id}" class="artist__image" src="${artist.artistImage}" alt="Artist Image"/>
                    <h4 class="artist__name">${artist.artistName}</h4>
                </div> 
            </li>

        `;
    
    }).join('')}
    </ul>
    
        <section class="add-artist">
            <input type="text" class="add-artist__name" placeholder="Artist's Name">
            <input type="text" class="add-artist__image" placeholder="Artist's Image">
            <input type="text" class="add-artist__age" placeholder="Artist's Age">
            <input type="text" class="add-artist__hometown" placeholder="Artist's Hometown">
            <input type="text" class="add-artist__rating" placeholder="Artist Rating">
            <button class="add-artist__submit">Add Artist</button>
        </section>
    `;
}
