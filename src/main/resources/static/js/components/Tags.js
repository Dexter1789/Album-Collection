export default function Tags(tags) {
    return `
        <ul id="tag">
            ${tags.map(tag => {
        return `
                    <li class="comment">
                        <h3 class="tagContent">${tag.content}</h3>
                    </li>
                `;
    }).join('')}
        </ul>
        
        `} 