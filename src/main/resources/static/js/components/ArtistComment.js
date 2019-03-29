export default function ArtistComment(comments) {
    return `
        <ul id="comment">
            ${comments.map(comment => {
        return `
                    <li class="comment">
                        <h3 class="commentContent">${comment.content}</h3>
                    </li>
                `;
    }).join('')}
        </ul>
        
        `} 